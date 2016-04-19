<%-- 
    Document   : compare
    Created on : Apr 18, 2016, 2:44:14 AM
    Author     : HongLinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compare</title>
        <link type="text/css" rel="stylesheet" href="resource/css/compare_style.css"/>
    </head>
    <body>
        <div class="center_content">
            <div class="compare">
                <div class="cd-pricing-container cd-has-margins">
                    <ul class="cd-pricing-list">
                        <li>
                            <header class="cd-pricing-header">
                                <h2 style="margin-top: 100px; color: red">Thông tin</h2>
<!--                                <div class="cd-price">

                                </div>-->
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
                        <c:set var="list" value="${XML}"/>
                        <c:if test="${not empty list}">
                            <c:import var="xslt" url="resource/compLapXSL.xsl"/>
                            <x:transform doc="${list}" xslt="${xslt}"/>
                        </c:if>

                    </ul> <!-- .cd-pricing-list -->
                </div> <!-- .cd-pricing-container -->
            </div>
        </div>
    </body>
</html>
