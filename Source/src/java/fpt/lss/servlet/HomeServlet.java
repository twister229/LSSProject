/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.lss.servlet;

import fpt.lss.dao.BrandDAO;
import fpt.lss.dao.LaptopDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HongLinh
 */
public class HomeServlet extends HttpServlet {

    private final String homepage = "homepage.jsp";
    private final int itemEachPage = 12;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        BrandDAO brandDAO = new BrandDAO();
        LaptopDAO laptopDAO = new LaptopDAO();
        try {
//            List listBrand = brandDAO.getAllBrand();
//            request.setAttribute("LISTBRAND", listBrand);

            String cateParam = request.getParameter("brandId");
            String page = request.getParameter("pageNum");
            int brandId = 0;
            int pageNum = 0;
            if (cateParam == null) {
                cateParam = "1";
            }
            if (page == null) {
                page = "1";
            }
            try {
                brandId = Integer.parseInt(cateParam);
                pageNum = Integer.parseInt(page);
            } catch (Exception ex) {
                brandId = 1;
                pageNum = 1;
            }
            int total = laptopDAO.getTotalLapByBrand(brandId);
            int offset = 0;
            int limit = itemEachPage;
            if ((pageNum - 1) * itemEachPage > total) {
                pageNum = total / itemEachPage + 1;
            }
            offset = (pageNum - 1) * itemEachPage;
            if (brandId > 0) {
                List listLaptop = laptopDAO.getLaptopByBrandId(brandId, offset, limit);
                request.setAttribute("LISTLAP", listLaptop);
            }
            request.setAttribute("pageNum", pageNum);
            request.setAttribute("totalPage", total / itemEachPage + 1);
            request.setAttribute("brandId", brandId);
            RequestDispatcher rd = request.getRequestDispatcher(homepage);
            rd.forward(request, response);
        } finally {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
