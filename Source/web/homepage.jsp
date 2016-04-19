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
    <body onload="loadCart();">
        <div id="main_container">
            <div id="header">
                <div class="top_right">
                    <div class="big_banner">
                        <a href="#"><img src="resource/images/banner728.jpg" alt="" border="0" /></a>
                    </div>
                </div>
                <div id="logo"><a href="#"><img src="resource/images/logo.png" alt="" border="0" width="182" height="85" /></a></div>
            </div>
            <div id="main_content">
                <div id="menu_tab">
                    <ul class="menu">
                        <li><a href="#" class="nav"> Trang chủ </a></li>
                        <li class="divider"></li>
                        <li><a href="#" class="nav">Comming soon....</a></li>
                        <li class="divider"></li>
<!--                        <li><a href="#" class="nav">Specials</a></li>
                        <li class="divider"></li>
                        <li><a href="#" class="nav">My account</a></li>
                        <li class="divider"></li>
                        <li><a href="#" class="nav">Sign Up</a></li>
                        <li class="divider"></li>
                        <li><a href="#" class="nav">Shipping </a></li>
                        <li class="divider"></li>
                        <li><a href="contact.html" class="nav">Contact Us</a></li>
                        <li class="divider"></li>
                        <li><a href="details.html" class="nav">Details</a></li>-->
                    </ul>
                </div>
                <!-- end of menu tab -->
                <div id="portamento_container" style="min-height: 78px; width: 194px;">
                    <form action="CenterServlet" id="sidebar" method="POST">	
                        <p style="font-size:.65em; margin: 0; position: absolute; right: 5px;"><a id="sidebar_minimize" href="#">minimize &gt;&gt;</a></p>
                        <br>
                        <p id="sidebar_default_text" style="font-size: 13px;">Danh sách laptop so sánh</p>
                        <div id="div_sidebar_table" class="compare_table">
                            <table id="compareTable">
                                <thead><tr><th colspan="2">Laptop so sánh</th></tr></thead>
                                <tbody></tbody>
                            </table>
                        </div>       
                        <input type="submit" name="btAction" id="sidebar_button" value="So sánh" onclick="return compareLap();"/>
                    </form>
                </div>
                <div class="crumb_navigation"> Navigation: <span class="current">Home</span> </div>
                <div class="left_content">
                    <div class="title_box">Hãng</div>
                    <ul class="left_menu">
                        <c:forEach var="brand" items="${LISTBRAND}">
                            <li class="odd"><a href="CenterServlet?btAction=homepage&brandId=${brand.id}">${brand.name}</a></li>
                            </c:forEach>
                    </ul>
                    <div class="title_box">Laptop mới</div>
                    <div class="border_box">
                        <div class="product_title"><a href="#">Makita 156 MX-VL</a></div>
<!--                        <div class="product_img"><a href="#"><img src="images/p1.jpg" alt="" border="0" /></a></div>-->
                        <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>
                    </div>
                </div>
                <!-- end of left content -->
                <div class="center_content">
<!--                    <div class="oferta"> <img src="images/p1.png" width="165" height="113" border="0" class="oferta_img" alt="" />
                        <div class="oferta_details">
                            <div class="oferta_title">Power Tools BST18XN Cordless</div>
                            <div class="oferta_text"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco </div>
                            <a href="#" class="prod_buy">details</a> </div>
                    </div>-->
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
                    <div class="center_title_bar">Recomended Products</div>
                    <div class="prod_box">
                        <div class="center_prod_box">
                            <div class="product_title"><a href="#">Makita 156 MX-VL</a></div>
                            <div class="product_img"><a href="#"><img src="images/p7.jpg" alt="" border="0" /></a></div>
                            <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>
                        </div>
                        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
                    </div>
                    <div class="prod_box">
                        <div class="center_prod_box">
                            <div class="product_title"><a href="#">Bosch XC</a></div>
                            <div class="product_img"><a href="#"><img src="images/p1.jpg" alt="" border="0" /></a></div>
                            <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>
                        </div>
                        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
                    </div>
                    <div class="prod_box">
                        <div class="center_prod_box">
                            <div class="product_title"><a href="#">Lotus PP4</a></div>
                            <div class="product_img"><a href="#"><img src="images/p3.jpg" alt="" border="0" /></a></div>
                            <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>
                        </div>
                        <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
                    </div>
                </div>
                <!-- end of center content -->
                
            </div>
            <!-- end of main content -->
            <div class="footer">
                <div class="left_footer"> <img src="images/footer_logo.png" alt="" width="89" height="42"/> </div>
                <div class="center_footer"> Template name. All Rights Reserved 2008<br />
                    <a href="http://csscreme.com"><img src="images/csscreme.jpg" alt="csscreme" title="csscreme" border="0" /></a><br />
                    <img src="images/payment.gif" alt="" /> </div>
                <div class="right_footer"> <a href="#">home</a> <a href="#">about</a> <a href="#">sitemap</a> <a href="#">rss</a> <a href="#">contact us</a> </div>
            </div>
        </div>
    </body>
</html>
