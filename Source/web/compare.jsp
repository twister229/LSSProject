<%-- 
    Document   : compare
    Created on : Apr 18, 2016, 2:44:14 AM
    Author     : HongLinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compare</title>
        <link type="text/css" rel="stylesheet" href="resource/css/compare_style.css"/>
    </head>
    <body>
        <header class="cd-header">
            <h1>Pricing Tables</h1>
        </header>
        <div class="cd-pricing-container cd-has-margins">
            <ul class="cd-pricing-list">
                <li>
                    <header class="cd-pricing-header">
                        <h2>Thông tin</h2>
                        <div class="cd-price">

                        </div>
                        <!--                        <div class="cd-price">
                                                    <span class="cd-currency">$</span>
                                                    <span class="cd-value">30</span>
                                                    <span class="cd-duration">mo</span>
                                                </div>-->
                    </header> <!-- .cd-pricing-header -->

                    <div class="cd-pricing-body">
                        <ul class="cd-pricing-features">
                            <li>CPU (Điểm)</li>
                            <li>Bộ nhớ RAM</li>
                            <li>Ổ cứng HDD</li>
                            <li>Ổ cứng SSD</li>
                            <li>Card màn hình (Điểm)</li>
                            <li>Kích thước màn hình</li>
                            <li>Cân nặng</li>
                        </ul>
                    </div> <!-- .cd-pricing-body -->

                    <!--                    <footer class="cd-pricing-footer">
                                            <a class="cd-select" href="http://codyhouse.co/?p=429">Select</a>
                                        </footer>  .cd-pricing-footer -->
                </li>
                <c:forEach var="lap" items="${LISTLAP}">
                    <li>
                        <header class="cd-pricing-header">
                            <h3>${lap.name}</h3>
                            <div class="cd-price">
                                <img class="avatar" src="${lap.avatar}"/>
                            </div>
                        </header> <!-- .cd-pricing-header -->

                        <div class="cd-pricing-body">
                            <ul class="cd-pricing-features">
                                <li>${lap.cpu.key} (<em>${lap.cpu.value}</em>)</li>
                                <li>${lap.ramSize} GB</li>
                                <li>${lap.hddSize} GB</li>
                                <li>${lap.ssdSize} GB</li>
                                <li>${lap.videoCard.key} (<em>${lap.videoCard.value}</em>)</li>
                                <li>${lap.screenSize} inch</li>
                                <li>${lap.weight} kg</li>
                            </ul>
                        </div> <!-- .cd-pricing-body -->

<!--                        <footer class="cd-pricing-footer">
                            <a class="cd-select" href="http://codyhouse.co/?p=429">Select</a>
                        </footer>  .cd-pricing-footer -->
                    </li>
                </c:forEach>
            </ul> <!-- .cd-pricing-list -->
        </div> <!-- .cd-pricing-container -->	
    </body>
</html>
