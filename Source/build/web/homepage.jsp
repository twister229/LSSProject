<%-- 
    Document   : homepage
    Created on : Apr 17, 2016, 5:10:46 PM
    Author     : HongLinh
--%>

<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" href="resource/css/style.css" rel="stylesheet"/>
        <script type="text/javascript" src="resource/js/myjs.js"></script>
    </head>
    <body>
        <div class="center_content">
            <div class="oferta">
                <div class="form-style-2">
                    <div class="form-style-2-heading">Provide your information</div>
                    <form action="" method="post">
                        <div style="float: left">
                            <label for="brandSearch">
                                <span>Hãng</span>
                                <select name="brandSearch" class="select-field">
                                    <c:forEach var="brand" items="${LISTBRAND}">
                                        <option value="${brand.id}">${brand.name}</option>
                                    </c:forEach>
                                </select>
                            </label>
                            <label for="cpuSearch">
                                <span>CPU</span>
                                <select name="cpuSearch" class="select-field">
                                    <option value="i3">Intel Core i3</option>
                                    <option value="i5">Intel Core i5</option>
                                    <option value="i7">Intel Core i7</option>
                                </select>
                            </label>
                        </div>
                        <div style="float: left; margin-left: 50px;">
                            <label for="ramSearch">
                                <span>RAM</span>
                                <select name="ramSearch" class="select-field">
                                    <option value="1">1 GB</option>
                                    <option value="2">2 GB</option>
                                    <option value="4">4 GB</option>
                                    <option value="8">8 GB</option>
                                    <option value="16">16 GB</option>
                                    <option value="32">34 GB</option>
                                </select>
                            </label>
                            <label for="videoCardParam">
                                <span>Card màn hình</span>
                                <select name="videoCardParam" class="select-field">
                                    <option value="0">Onboard</option>
                                    <option value="1">GeForce</option>
                                    <option value="2">Quadro</option>
                                    <option value="3">Radeon</option>
                                </select>
                            </label>
                        </div>
                        <div style="float: left;">
                            <label><span>&nbsp;</span><input type="submit" value="Tìm" /></label>
                            <label><span>&nbsp;</span><input type="reset" value="Clear" /></label>
                        </div>
                    </form>
                </div>
            </div>
            <div class="center_title_bar">Laptop</div>
            <c:forEach var="lap" items="${LISTLAP}">
                <div class="prod_box">
                    <a href="CenterServlet?btAction=viewDetail&laptopId=${lap.id}">
                        <div class="center_prod_box">
                            <div class="product_title">${lap.name}</div>
                            <div class="product_img"><img style="width: 150px;height: 150px;" src="${lap.avatar}" alt="" border="0" /></div>
                            <!--<div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>-->
                        </div>
                    </a>
                    <div class="prod_details_tab">
                        <button class="prod_buy" onclick="addCompare(${lap.id}, '${lap.name}');">So sánh</button>
                        <a href="${lap.sourceLink}" class="prod_details">Chi tiết</a>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="paging">
            <ul class="paginate pag4 clearfix">
                <li class="single">Trang ${pageNum} / ${totalPage}</li>
                    <c:if test="${pageNum - 1 > 0}">
                    <li class="navpage"><a href="CenterServlet?btAction=homepage&brandId=${brandId}&pageNum=1">Đầu</a></li>
                    </c:if>
                    <c:if test="${pageNum - 2 > 0}">
                    <li><a href="CenterServlet?btAction=homepage&brandId=${brandId}&pageNum=${pageNum - 2}">${pageNum - 2}</a></li>
                    </c:if>
                    <c:if test="${pageNum - 1 > 0}">
                    <li><a href="CenterServlet?btAction=homepage&brandId=${brandId}&pageNum=${pageNum - 1}">${pageNum - 1}</a></li>
                    </c:if>
                <li class="current">${pageNum}</li>
                    <c:if test="${pageNum + 1 <= totalPage}">
                    <li><a href="CenterServlet?btAction=homepage&brandId=${brandId}&pageNum=${pageNum + 1}">${pageNum + 1}</a></li>
                    </c:if>
                    <c:if test="${pageNum + 2 <= totalPage}">
                    <li><a href="CenterServlet?btAction=homepage&brandId=${brandId}&pageNum=${pageNum + 2}">${pageNum + 2}</a></li>
                    </c:if>
                    <c:if test="${pageNum + 1 <= totalPage}">
                    <li class="navpage"><a href="CenterServlet?btAction=homepage&brandId=${brandId}&pageNum=${totalPage}">Cuối</a></li>
                    </c:if>
            </ul>
        </div>
    </body>
</html>
