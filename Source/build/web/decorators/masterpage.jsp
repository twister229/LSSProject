<%-- 
    Document   : masterpage
    Created on : Apr 19, 2016, 8:07:29 AM
    Author     : HongLinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LSSProject</title>
        <link type="text/css" href="resource/css/style.css" rel="stylesheet"/>
        <script type="text/javascript" src="resource/js/myjs.js"></script>
        <link type="text/css" rel="stylesheet" href="resource/css/compare_style.css"/>
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
                        <li><a href="./" class="nav"> Trang chủ </a></li>
                        <li class="divider"></li>
                        <li><a href="#" class="nav">Comming soon....</a></li>
                        <li class="divider"></li>
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
                <!--<div class="crumb_navigation"> Navigation: <span class="current">Home</span> </div>-->
                <div class="left_content">
                    <div class="title_box">Hãng</div>
                    <ul class="left_menu">
                        <c:forEach var="brand" items="${LISTBRAND}">
                            <li class="odd">
                                <a href="CenterServlet?btAction=homepage&brandId=${brand.id}">${brand.name}</a>
                            </li>
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
                <decorator:body />
            </div>

            <!-- end of main content -->
<!--            <div class="footer">
                <div class="left_footer"> <img src="images/footer_logo.png" alt="" width="89" height="42"/> </div>
                <div class="center_footer"> Template name. All Rights Reserved 2008<br />
                    <a href="http://csscreme.com"><img src="images/csscreme.jpg" alt="csscreme" title="csscreme" border="0" /></a><br />
                    <img src="images/payment.gif" alt="" /> </div>
                <div class="right_footer"> <a href="#">home</a> <a href="#">about</a> <a href="#">sitemap</a> <a href="#">rss</a> <a href="#">contact us</a> </div>
            </div>-->

        </div>

    </body>
</html>
