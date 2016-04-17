<%-- 
    Document   : homepage
    Created on : Apr 17, 2016, 5:10:46 PM
    Author     : HongLinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" href="resource/css/style.css" rel="stylesheet"/>
    </head>
    <body>
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
                        <li><a href="#" class="nav"> Home </a></li>
                        <li class="divider"></li>
                        <li><a href="#" class="nav">Products</a></li>
                        <li class="divider"></li>
                        <li><a href="#" class="nav">Specials</a></li>
                        <li class="divider"></li>
                        <li><a href="#" class="nav">My account</a></li>
                        <li class="divider"></li>
                        <li><a href="#" class="nav">Sign Up</a></li>
                        <li class="divider"></li>
                        <li><a href="#" class="nav">Shipping </a></li>
                        <li class="divider"></li>
                        <li><a href="contact.html" class="nav">Contact Us</a></li>
                        <li class="divider"></li>
                        <li><a href="details.html" class="nav">Details</a></li>
                    </ul>
                </div>
                <!-- end of menu tab -->
                <div class="crumb_navigation"> Navigation: <span class="current">Home</span> </div>
                <div class="left_content">
                    <div class="title_box">Categories</div>
                    <ul class="left_menu">
                        <li class="odd"><a href="#">Power Tools</a></li>
                        <li class="even"><a href="#">Air Tools</a></li>
                        <c:forEach var="brand" items="${LISTBRAND}">
                            <li class="odd"><a href="#">${brand.name}</a></li>
                        </c:forEach>
                    </ul>
                    <div class="title_box">Special Products</div>
                    <div class="border_box">
                        <div class="product_title"><a href="#">Makita 156 MX-VL</a></div>
                        <div class="product_img"><a href="#"><img src="images/p1.jpg" alt="" border="0" /></a></div>
                        <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>
                    </div>
                    <div class="title_box">Newsletter</div>
                    <div class="border_box">
                        <input type="text" name="newsletter" class="newsletter_input" value="your email"/>
                        <a href="#" class="join">subscribe</a> </div>
                    <div class="banner_adds"> <a href="#"><img src="images/bann2.jpg" alt="" border="0" /></a> </div>
                </div>
                <!-- end of left content -->
                <div class="center_content">
                    <div class="oferta"> <img src="images/p1.png" width="165" height="113" border="0" class="oferta_img" alt="" />
                        <div class="oferta_details">
                            <div class="oferta_title">Power Tools BST18XN Cordless</div>
                            <div class="oferta_text"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco </div>
                            <a href="#" class="prod_buy">details</a> </div>
                    </div>
                    <div class="center_title_bar">Latest Products</div>
                    <c:forEach var="lap" items="${LISTLAP}">
                        <div class="prod_box">
                            <div class="center_prod_box">
                                <div class="product_title"><a href="#">${lap.name}</a></div>
                                <div class="product_img"><a href="#"><img style="width: 150px;height: 150px;" src="${lap.avatar}" alt="" border="0" /></a></div>
                                <!--<div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>-->
                            </div>
                            <div class="prod_details_tab"> <a href="#" class="prod_buy">Add to Cart</a> <a href="#" class="prod_details">Details</a> </div>
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
                <div class="right_content">
                    <div class="title_box">Search</div>
                    <div class="border_box">
                        <input type="text" name="newsletter" class="newsletter_input" value="keyword"/>
                        <a href="#" class="join">search</a> </div>
                    <div class="shopping_cart">
                        <div class="title_box">Shopping cart</div>
                        <div class="cart_details"> 3 items <br />
                            <span class="border_cart"></span> Total: <span class="price">350$</span> </div>
                        <div class="cart_icon"><a href="#"><img src="images/shoppingcart.png" alt="" width="35" height="35" border="0" /></a></div>
                    </div>
                    <div class="title_box">What’s new</div>
                    <div class="border_box">
                        <div class="product_title"><a href="#">Motorola 156 MX-VL</a></div>
                        <div class="product_img"><a href="#"><img src="images/p2.jpg" alt="" border="0" /></a></div>
                        <div class="prod_price"><span class="reduce">350$</span> <span class="price">270$</span></div>
                    </div>
                    <div class="title_box">Manufacturers</div>
                    <ul class="left_menu">
                        <li class="odd"><a href="#">Bosch</a></li>
                        <li class="even"><a href="#">Samsung</a></li>
                        <li class="odd"><a href="#">Makita</a></li>
                        <li class="even"><a href="#">LG</a></li>
                        <li class="odd"><a href="#">Fujitsu Siemens</a></li>
                        <li class="even"><a href="#">Motorola</a></li>
                        <li class="odd"><a href="#">Phillips</a></li>
                        <li class="even"><a href="#">Beko</a></li>
                    </ul>
                    <div class="banner_adds"> <a href="#"><img src="images/bann1.jpg" alt="" border="0" /></a> </div>
                </div>
                <!-- end of right content -->
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
