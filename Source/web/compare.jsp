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
        <a href="/"><img src="//cdn.productchart.com/elements/objects/logo-main.png" style="margin-top: 27px;"></a>
        <c:forEach var="lap" items="${LISTLAP}">
            <h1>${lap.name}</h1>
        </c:forEach>
        <div class="navi">
            <a href="/">Product Chart</a> / <a href="./">Laptops</a> / Acer Aspire E 15 E5-574G <div style="display: inline; color: #f05000">vs</div> Asus Flip TP550
        </div>
        <!--<link rel="stylesheet" href="//cdn.productchart.com/elements/objects/styles_info_page.css">-->

        <div class="content">

            <!--<link rel="stylesheet" href="//cdn.productchart.com/elements/objects/compare.css?v3">-->

            <!--<script async="" src="//www.google-analytics.com/analytics.js"></script><script src="//cdn.productchart.com/elements/objects/jquery.min.js"></script>-->

            <div class="comparison_and_controls">

                <div id="comparison_chart" class="comparison_chart"><!--comparisonchartstart-->
                    <h1 style="text-align: center">Acer Aspire E 15 E5-574G <span class="vs">vs</span> Asus Flip TP550</h1>

                    <table class="item_infos">

                        <tbody><tr>
                                <td style="width: 50%">
                                    <a href="8483" class="imgback"><img src="http://ecx.images-amazon.com/images/I/412LQqhdMkL._SL160_.jpg"></a>
                                </td>
                                <td style="vertical-align: middle; text-align: center;">vs</td>
                                <td>
                                    <a href="8400" class="imgback"><img src="http://ecx.images-amazon.com/images/I/41W2au%2BH-sL._SL160_.jpg"></a>
                                </td>
                            </tr>

                            <tr class="names">
                                <td><a href="8483">Acer Aspire E 15 E5-574G</a></td>
                                <td></td>
                                <td><a href="8400">Asus Flip TP550</a></td>
                            </tr>
                        </tbody></table>

                    <table id="ctab" class="ctab">

                        <tbody><tr>
                                <td class="data">Yes</td>
                                <td class="centerthingy">
                                    <div class="comparison">
                                        <div class="bar" style="background: linear-gradient( 90deg, #f0f0f0, #f0f0f0  -0.3573%, #5f0  -0.3573%, #ff0 50%, #f0f0f0 50% );"><span>Discrete GPU</span></div>
                                    </div>
                                </td>
                                <td class="data">No</td>
                            </tr>

                            <tr>
                                <td class="data">15.6</td>
                                <td class="centerthingy">
                                    <div class="comparison">
                                        <div class="bar" style="background: linear-gradient( 90deg, #f0f0f0, #f0f0f0  50%, #5f0  50%, #ff0 50%, #f0f0f0 50% );"><span>Display</span></div>
                                    </div>
                                </td>
                                <td class="data">15.6</td>
                            </tr>

                            <tr>
                                <td class="data">1920</td>
                                <td class="centerthingy">
                                    <div class="comparison">
                                        <div class="bar" style="background: linear-gradient( 90deg, #f0f0f0, #f0f0f0  20.4801%, #5f0  20.4801%, #ff0 50%, #f0f0f0 50% );"><span>Resolution X</span></div>
                                    </div>
                                </td>
                                <td class="data">1366</td>
                            </tr>

                            <tr>
                                <td class="data">1080</td>
                                <td class="centerthingy">
                                    <div class="comparison">
                                        <div class="bar" style="background: linear-gradient( 90deg, #f0f0f0, #f0f0f0  20.4676%, #5f0  20.4676%, #ff0 50%, #f0f0f0 50% );"><span>Resolution Y</span></div>
                                    </div>
                                </td>
                                <td class="data">768</td>
                            </tr>

                            <tr>
                                <td class="data">8</td>
                                <td class="centerthingy">
                                    <div class="comparison">
                                        <div class="bar" style="background: linear-gradient( 90deg, #f0f0f0, #f0f0f0  0%, #5f0  13.7818%, #ff0 50%, #f0f0f0 50% );"><span>RAM</span></div>
                                    </div>
                                </td>
                                <td class="data">4</td>
                            </tr>

                            <tr>
                                <td class="data">1000</td>
                                <td class="centerthingy">
                                    <div class="comparison">
                                        <div class="bar" style="background: linear-gradient( 90deg, #f0f0f0, #f0f0f0  13.7818%, #5f0  13.7818%, #ff0 50%, #f0f0f0 50% );"><span>Storage</span></div>
                                    </div>
                                </td>
                                <td class="data">500</td>
                            </tr>

                            <tr>
                                <td class="data">0</td>
                                <td class="centerthingy">
                                    <div class="comparison">
                                        <div class="bar" style="background: linear-gradient( 90deg, #f0f0f0, #f0f0f0  50%, #5f0  50%, #ff0 50%, #f0f0f0 50% );"><span>Storage Solid State</span></div>
                                    </div>
                                </td>
                                <td class="data">0</td>
                            </tr>

                            <tr>
                                <td class="data">No</td>
                                <td class="centerthingy">
                                    <div class="comparison">
                                        <div class="bar" style="background: linear-gradient( 90deg, #f0f0f0, #f0f0f0 50%, #ff0 50%, #5f0 100.3573%, #f0f0f0 100.3573% );"><span>Touchscreen</span></div>
                                    </div>
                                </td>
                                <td class="data">Yes</td>
                            </tr>

                            <tr>
                                <td class="data">No</td>
                                <td class="centerthingy">
                                    <div class="comparison">
                                        <div class="bar" style="background: linear-gradient( 90deg, #f0f0f0, #f0f0f0  50%, #5f0  50%, #ff0 50%, #f0f0f0 50% );"><span>Detachable Keyboard</span></div>
                                    </div>
                                </td>
                                <td class="data">No</td>
                            </tr>

                            <tr>
                                <td class="data">5.29</td>
                                <td class="centerthingy">
                                    <div class="comparison">
                                        <div class="bar" style="background: linear-gradient( 90deg, #f0f0f0, #f0f0f0  32.6874%, #5f0  32.6874%, #ff0 50%, #f0f0f0 50% );"><span>Weight</span></div>
                                    </div>
                                </td>
                                <td class="data">5.6</td>
                            </tr>

                            <tr>
                                <td class="data">$549.99</td>
                                <td class="centerthingy">
                                    <div class="comparison">
                                        <div class="bar" style="background: linear-gradient( 90deg, #f0f0f0, #f0f0f0 50%, #ff0 50%, #5f0 76.2834%, #f0f0f0 76.2834% );"><span>Price</span></div>
                                    </div>
                                </td>
                                <td class="data">$437.00</td>
                            </tr>

                        </tbody></table>

                    <table class="ctab priceinfos">
                        <tbody><tr>
                                <td colspan="2" class="price_info">Prices as of Apr 17, 2016, 00:01 PST and Apr 17, 2016, 06:58 PST - <a href="/info/prices">Details</a></td>
                            </tr>
                            <tr class="buyinfo">
                                <td>
                                    <a target="_blank" href="http://www.amazon.com/Acer-Aspire-E5-574G-52QU-15-6-inch-Notebook/dp/B019G7VOSO%3Fpsc%3D1%26SubscriptionId%3DAKIAJ76EIXAV3V6D6JEQ%26tag%3Dglobalnetwork-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3DB019G7VOSO">Buy this laptop</a>
                                </td>
                                <td>
                                    <a target="_blank" href="http://www.amazon.com/Newest-Asus-Performance-Touchscreen-Convertible/dp/B01A05VGNY%3FSubscriptionId%3DAKIAJ76EIXAV3V6D6JEQ%26tag%3Dglobalnetwork-20%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3DB01A05VGNY">Buy this laptop</a>
                                </td>
                            </tr>
                        </tbody></table>

                </div><!--comparisonchartend-->

                <div class="similar_items">
                    <div class="similar_items_headline">
                        <a href="similar_to_8483">Laptops similar to the Acer Aspire E 15 E5-574G</a>
                    </div>

                    <a class="similar_item" id="similar_item_6993" href="8483_vs_6993">
                        <div class="imgback"><img src="http://ecx.images-amazon.com/images/I/51u%2BCjYcYGL._SL160_.jpg"></div>
                        <div>Acer Aspire V 15</div>
                    </a>

                    <a class="similar_item" id="similar_item_7495" href="8483_vs_7495">
                        <div class="imgback"><img src="http://ecx.images-amazon.com/images/I/41LAesMrPNL._SL160_.jpg"></div>
                        <div>Acer Aspire E 15 E5-573G</div>
                    </a>

                    <a class="similar_item" id="similar_item_5793" href="8483_vs_5793">
                        <div class="imgback"><img src="http://ecx.images-amazon.com/images/I/518elrtBLkL._SL160_.jpg"></div>
                        <div>Lenovo Z50</div>
                    </a>

                    <a class="similar_item" id="similar_item_4060" href="8483_vs_4060">
                        <div class="imgback"><img src="http://ecx.images-amazon.com/images/I/51u%2BCjYcYGL._SL160_.jpg"></div>
                        <div>Acer Aspire V3-572G-70TA</div>
                    </a>

                    <a class="similar_item" id="similar_item_6736" href="8483_vs_6736">
                        <div class="imgback"><img src="http://ecx.images-amazon.com/images/I/41dYXz-MWeL._SL160_.jpg"></div>
                        <div>Acer Aspire E5-772G-52Q7</div>
                    </a>

                </div>

            </div> <!-- comparison_and_controls -->

            <div style="text-align: center; padding-top: 50px;"><a style="color: #505050" href="/about">about</a></div>

            <script>
                function switchActiveItem()
                {
                    $(".similar_item.active").removeClass("active");
                    $("#similar_item_" + activeItem).addClass("active");
                }
                activeItem = 8400;
                switchActiveItem();
            </script>




        </div>

        <script src="/elements/objects/mgAnalytics.js"></script>



    </body>
</html>
