/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.utils;

import fpt.lss.annotation.Entity;
import fpt.lss.annotation.Key;
import fpt.lss.annotation.Table;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author HongLinh
 */
public class DBUtils {

//    private static Connection getConnection() throws NamingException, SQLException {
//        Context ctx = new InitialContext();
//        Context envCtx = (Context) ctx.lookup("java:comp/env");
//        DataSource ds = (DataSource) envCtx.lookup("DBCon");
//        Connection conn = ds.getConnection();
//        return conn;
//    }
    private static Connection getConnection() throws NamingException, SQLException {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=LSSProject;instanceName=SQLEXPRESS;useUnicode=true;characterEncoding=UTF-8";
            con = DriverManager.getConnection(url, "sa", "honglinh");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> List<T> fetchAll(Class<T> entityClass) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            List<T> result = new ArrayList<T>();
            T instance;
            String sql = "SELECT * FROM " + entityClass.getAnnotation(Table.class).name();
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                instance = entityClass.newInstance();
                for (Field field : entityClass.getDeclaredFields()) {
                    String value = field.getAnnotation(Entity.class).name();
                    field.setAccessible(true);
                    field.set(instance, rs.getObject(value));
                }
                result.add(instance);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static <T> T fetchByKey(Object keyValue, Class<T> entityClass) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            T result = entityClass.newInstance();
            String key = getKey(entityClass);
            if (key != null) {
                String sql = "SELECT * FROM " + entityClass.getAnnotation(Table.class).name() + " WHERE " + key + "=?";
                stm = con.prepareStatement(sql);
                stm.setObject(1, keyValue);
                rs = stm.executeQuery();

                if (rs.next()) {
                    for (Field field : entityClass.getDeclaredFields()) {
                        String value = field.getAnnotation(Entity.class).name();
                        field.setAccessible(true);
                        field.set(result, rs.getObject(value));
                    }
                }
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static <T> List<T> fetchByQuery(String query, Class<T> entityClass, Object... params) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            List<T> result = new ArrayList<T>();
            T instance;
            String sql = "SELECT * FROM " + entityClass.getAnnotation(Table.class).name() + " " + query;
            stm = con.prepareStatement(sql);
            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    stm.setObject(i + 1, params[i]);
                }
            }
            rs = stm.executeQuery();

            while (rs.next()) {
                instance = entityClass.newInstance();
                for (Field field : entityClass.getDeclaredFields()) {
                    String value = field.getAnnotation(Entity.class).name();
                    field.setAccessible(true);
                    field.set(instance, rs.getObject(value));
                }
                result.add(instance);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static <T> List<T> fetchByQueryLimitOffset(String query, Class<T> entityClass, int offset, int limit, Object... params) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            List<T> result = new ArrayList<T>();
            T instance;
            String keyLabel = getKey(entityClass);
//            String sql = "SELECT * FROM " + entityClass.getAnnotation(Table.class).name() + " " + query;
            String sql = "SELECT * FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY " + keyLabel + ") as row FROM "
                    + entityClass.getAnnotation(Table.class).name() + " " + query + ") a WHERE row > " + offset + "and row <= " + (offset + limit);
            stm = con.prepareStatement(sql);
            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    stm.setObject(i + 1, params[i]);
                }
            }
            rs = stm.executeQuery();

            while (rs.next()) {
                instance = entityClass.newInstance();
                for (Field field : entityClass.getDeclaredFields()) {
                    String value = field.getAnnotation(Entity.class).name();
                    field.setAccessible(true);
                    field.set(instance, rs.getObject(value));
                }
                result.add(instance);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static <T> T update(T entity) {
        Connection con = null;
        PreparedStatement stm = null;

        try {
            con = getConnection();
            String keyLabel = getKey(entity.getClass());
            Map<Integer, Object> map = new HashMap<Integer, Object>();
            int count = 1;
            String setQuery = "SET";

            for (Field field : entity.getClass().getDeclaredFields()) {
                if (getColumnName(field) != null) {
                    setQuery = setQuery + " " + getColumnName(field) + "=?,";
                    field.setAccessible(true);
                    map.put(count, field.get(entity));
                    count++;
                }
            }

            setQuery = setQuery.substring(0, setQuery.length() - 1);

            if (keyLabel != null) {
                String sql = "UPDATE " + entity.getClass().getAnnotation(Table.class).name() + " " + setQuery + " WHERE " + keyLabel + "=?";
                System.out.println(sql);
                stm = con.prepareStatement(sql);
                for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                    stm.setObject(entry.getKey(), entry.getValue());
                }
                stm.setObject(count, getKeyValue(entity));

                if (stm.executeUpdate() > 0) {
                    return entity;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stm.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static <T> T save(T entity) throws SQLException, IllegalArgumentException, IllegalAccessException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet generatedKeys = null;
        boolean isIdentity = false;
        try {
            con = getConnection();
            Map<Integer, Object> map = new HashMap<Integer, Object>();
            int count = 1;
            String paramQuery = "(";
            String inputQuery = "(";

            for (Field field : entity.getClass().getDeclaredFields()) {
                if (getColumnName(field) != null) {
                    if (isIdentity(field)) {
                        isIdentity = true;
                    } else {
                        if (count > 1) {
                            paramQuery += ", ";
                            inputQuery += ", ";
                        }
                        paramQuery += getColumnName(field);
                        inputQuery += "?";
                        field.setAccessible(true);
                        map.put(count, field.get(entity));
                        count++;
                    }
                }
            }

            paramQuery += ")";
            inputQuery += ")";

            String sql = "INSERT INTO " + entity.getClass().getAnnotation(Table.class).name()
                    + paramQuery + " VALUES " + inputQuery;
            stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                stm.setObject(entry.getKey(), entry.getValue());
            }
            if (stm.executeUpdate() > 0) {
                if (isIdentity) {
                    generatedKeys = stm.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        return setKeyValue(entity, generatedKeys.getObject(1));
                    } else {
                        throw new SQLException("Creating user failed, no ID obtained.");
                    }
                } else {
                    return entity;
                }
            }
        } finally {
            try {
                if (generatedKeys != null) {
                    generatedKeys.close();
                }
                stm.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static <T> List<T> fetchAllLimitOffset(Class<T> entityClass, int offset, int limit) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            List<T> result = new ArrayList<T>();
            T instance;
            String keyLabel = getKey(entityClass);
//            String sql = "SELECT * FROM " + entityClass.getAnnotation(Table.class).name() + " " + query;
            String sql = "SELECT * FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY " + keyLabel + ") as row FROM "
                    + entityClass.getAnnotation(Table.class).name() + ") a WHERE row > " + offset + "and row <= " + (offset + limit);
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                instance = entityClass.newInstance();
                for (Field field : entityClass.getDeclaredFields()) {
                    String value = field.getAnnotation(Entity.class).name();
                    field.setAccessible(true);
                    field.set(instance, rs.getObject(value));
                }
                result.add(instance);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static <T> int getCount(Class<T> entityClass, String query, Object... params) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            String sql = "SELECT COUNT(*) FROM " + entityClass.getAnnotation(Table.class).name() + " " + query;
            stm = con.prepareStatement(sql);

            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    stm.setObject(i + 1, params[i]);
                }
            }

            rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stm.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    private static String getKey(Class entityClass) {
        for (Field field : entityClass.getDeclaredFields()) {
            if (field.getAnnotation(Key.class) != null) {
                return field.getAnnotation(Entity.class).name();
            }
        }
        return null;
    }

    private static boolean isIdentity(Field field) {
        if (field.getAnnotation(Key.class) != null) {
            return field.getAnnotation(Key.class).indentity();
        }
        return false;
    }

    private static Object getKeyValue(Object obj) throws IllegalArgumentException, IllegalAccessException {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.getAnnotation(Key.class) != null) {
                field.setAccessible(true);
                return field.get(obj);
            }
        }
        return null;
    }

    private static <T> T setKeyValue(T entity, Object value) throws IllegalArgumentException, IllegalAccessException {
        for (Field field : entity.getClass().getDeclaredFields()) {
            if (field.getAnnotation(Key.class) != null) {
                field.setAccessible(true);
                field.set(entity, value);
                return entity;
            }
        }
        return null;
    }

    private static String getColumnName(Field field) {
        return field.getAnnotation(Entity.class).name();
    }

}
