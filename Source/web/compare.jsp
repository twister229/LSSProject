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

        <div class="comparison-size-container">

            <table class="summary">
                <thead>
                    <tr class="action-comparison">
                        <th></th>
                        <th data-product-id="10468" scope="col">
                <form class="frm-comparison frm-remove-comparison" data-product-id="10468" data-location="comparison" data-action-add="/reviews/laptops/compare/add/acer-aspire-v-nitro" data-action-delete="/reviews/laptops/compare/delete/acer-aspire-v-nitro" action="/reviews/laptops/compare/delete/acer-aspire-v-nitro" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="✓"><input type="hidden" name="authenticity_token" value="jllEAMZNqKXVEIqZdaHDRN6JFQZf4Gij6q0Z/v7Gpvy9RvSsZHIuXND5eYp3DqP4iJNxTlwUdAjZnXKrbpy2Ig=="><button name="button" type="submit" class="action-remove icon-close"></button><button name="button" type="submit" class="action-add">Add to compare</button></form>
                </th>
                <th data-product-id="10469" scope="col">
                <form class="frm-comparison frm-remove-comparison" data-product-id="10469" data-location="comparison" data-action-add="/reviews/laptops/compare/add/lenovo-ideapad-100" data-action-delete="/reviews/laptops/compare/delete/lenovo-ideapad-100" action="/reviews/laptops/compare/delete/lenovo-ideapad-100" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="✓"><input type="hidden" name="authenticity_token" value="RmnOgYfvnDmxP4jCx3/SZyZM4lPeGBufEySCWNYWORB1dn4tJdAawLTWe9HF0LLbcFaGG93sBzQgFOkNRkwpzg=="><button name="button" type="submit" class="action-remove icon-close"></button><button name="button" type="submit" class="action-add">Add to compare</button></form>
                </th>
                <th data-product-id="10470" scope="col">
                <form class="frm-comparison frm-remove-comparison" data-product-id="10470" data-location="comparison" data-action-add="/reviews/laptops/compare/add/toshiba-satellite-c70d" data-action-delete="/reviews/laptops/compare/delete/toshiba-satellite-c70d" action="/reviews/laptops/compare/delete/toshiba-satellite-c70d" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="✓"><input type="hidden" name="authenticity_token" value="bojwXUOvF6+hSvxZ/IYMZtOAYemYHDMkO7TsZ4QH+cZdl0Dx4ZCRVqSjD0r+KWzahZoFoZvoL48IhIcyFF3pGA=="><button name="button" type="submit" class="action-remove icon-close"></button><button name="button" type="submit" class="action-add">Add to compare</button></form>
                </th>
                </tr>

                <tr class="product-images">
                    <th class="cont-edit-comparison" scope="row" rowspan="2">
                <div>
                    <button class="edit-list button button-primary-small" type="button" data-track-key="compare_choose_fields">Personalise your comparison
                    </button>
                </div>
                </th>

                <th data-product-id="10468" scope="col">
                <div class="product-image">
                    <a href="/reviews/laptops/acer-aspire-v-nitro">
                        <img class="comparison-product-thumbnail" alt="Acer Aspire V Nitro" src="http://dam.which.co.uk.s3-website-eu-west-1.amazonaws.com/b1da8ace-bf95-41a4-91bc-0547bf54d47f.jpg">
                    </a>
                </div>

                </th>
                <th data-product-id="10469" scope="col">
                <div class="product-image">
                    <a href="/reviews/laptops/lenovo-ideapad-100">
                        <img class="comparison-product-thumbnail" alt="Lenovo IdeaPad 100" src="http://dam.which.co.uk.s3-website-eu-west-1.amazonaws.com/4e99cbd9-fe66-49a2-a57c-d77e809243e9.jpg">
                    </a>
                </div>

                </th>
                <th data-product-id="10470" scope="col">
                <div class="product-image">
                    <a href="/reviews/laptops/toshiba-satellite-c70d">
                        <img class="comparison-product-thumbnail" alt="Toshiba Satellite C70D" src="http://dam.which.co.uk.s3-website-eu-west-1.amazonaws.com/0c4d0d8b-e41d-4430-8ca9-0a6a81deff64.jpg">
                    </a>
                </div>

                </th>
                </tr>

                <tr class="model">
                    <th data-product-id="10468" scope="col">
                <div class="cell-inner-wrapper">
                    <div class="product-details-micro">
                        <div class="name">
                            <span class="manufacturer">Acer</span>
                            <span class="model">Aspire V Nitro</span>
                        </div>
                    </div>
                </div>
                </th>
                <th data-product-id="10469" scope="col">
                <div class="cell-inner-wrapper">
                    <div class="product-details-micro">
                        <div class="name">
                            <span class="manufacturer">Lenovo</span>
                            <span class="model">IdeaPad 100</span>
                        </div>
                    </div>
                </div>
                </th>
                <th data-product-id="10470" scope="col">
                <div class="cell-inner-wrapper">
                    <div class="product-details-micro">
                        <div class="name">
                            <span class="manufacturer">Toshiba</span>
                            <span class="model">Satellite C70D</span>
                        </div>
                    </div>
                </div>
                </th>
                </tr>
                </thead>

                <tbody>
                    <tr class="score">
                        <th scope="row">
                            <label><input type="checkbox"><span class="inner-label">Which? score
                                </span></label>
                        </th>

                        <td data-product-id="10468" class="behind-paywall">
                            Member exclusive
                        </td>
                        <td data-product-id="10469" class="behind-paywall">
                            Member exclusive
                        </td>
                        <td data-product-id="10470" class="behind-paywall">
                            Member exclusive
                        </td>


                    </tr>

                    <!-- REMOVED PENDING RE-INTEGRATION OF REVOO
                    <tr class="reevoo">
                     <th scope="row">
                       <label><input type="checkbox"/><span class="inner-label">Reevoo score</span></label>
                     </th>
         
         
                   </tr> -->

                    <tr class="price">
                        <th>
                            <label>
                                <input type="checkbox">
                                <span class="inner-label">Price</span>
                            </label>
                        </th>
                        <td data-product-id="10468">
                            <div class="product-offers">
                                <span class="comparison-price">£850.00</span>
                                <span class="comparison-smallprint">(Typical price)</span>
                            </div>
                        </td>
                        <td data-product-id="10469">
                            <div class="product-offers">
                                <span class="comparison-price">£220.00</span>
                                <span class="comparison-smallprint">(Typical price)</span>
                            </div>
                        </td>
                        <td data-product-id="10470">
                            <div class="product-offers">
                                <span class="comparison-price">£400.00</span>
                                <span class="comparison-smallprint">(Typical price)</span>
                            </div>
                        </td>
                    </tr>

                    <tr class="subheading" data-category="tests-heading">
                        <th>
                <h2>Test results
                </h2>
                </th>
                <td class="table-cell-wrapper" data-product-id="10468">
                    <div class="table-cell-wrapper-inner">

                    </div>
                </td>
                <td data-product-id="10469"></td>
                <td data-product-id="10470"></td>
                </tr>

                <tr class="test-results" data-category="tests">
                    <th class="behind-paywall">
                        <label><input type="checkbox">
                            <span class="inner-label">Ease of Use</span>
                        </label>
                    </th>

                    <td data-product-id="10468" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10469" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10470" class="behind-paywall">
                        Member exclusive
                    </td>
                </tr>
                <tr class="test-results" data-category="tests">
                    <th class="behind-paywall">
                        <label><input type="checkbox">
                            <span class="inner-label">Performance</span>
                        </label>
                    </th>

                    <td data-product-id="10468" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10469" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10470" class="behind-paywall">
                        Member exclusive
                    </td>
                </tr>
                <tr class="test-results" data-category="tests">
                    <th class="behind-paywall">
                        <label><input type="checkbox">
                            <span class="inner-label">Screen quality</span>
                        </label>
                    </th>

                    <td data-product-id="10468" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10469" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10470" class="behind-paywall">
                        Member exclusive
                    </td>
                </tr>
                <tr class="test-results" data-category="tests">
                    <th class="behind-paywall">
                        <label><input type="checkbox">
                            <span class="inner-label">Speaker sound quality</span>
                        </label>
                    </th>

                    <td data-product-id="10468" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10469" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10470" class="behind-paywall">
                        Member exclusive
                    </td>
                </tr>
                <tr class="test-results" data-category="tests">
                    <th class="behind-paywall">
                        <label><input type="checkbox">
                            <span class="inner-label">Portability</span>
                        </label>
                    </th>

                    <td data-product-id="10468" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10469" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10470" class="behind-paywall">
                        Member exclusive
                    </td>
                </tr>
                <tr class="test-results" data-category="tests">
                    <th class="behind-paywall">
                        <label><input type="checkbox">
                            <span class="inner-label">Battery</span>
                        </label>
                    </th>

                    <td data-product-id="10468" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10469" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10470" class="behind-paywall">
                        Member exclusive
                    </td>
                </tr>
                <tr class="test-results" data-category="tests">
                    <th class="behind-paywall">
                        <label><input type="checkbox">
                            <span class="inner-label">Features</span>
                        </label>
                    </th>

                    <td data-product-id="10468" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10469" class="behind-paywall">
                        Member exclusive
                    </td>
                    <td data-product-id="10470" class="behind-paywall">
                        Member exclusive
                    </td>
                </tr>


                <tr class="subheading" data-category="review-details-heading">
                    <th>
                <h2>Review details</h2>
                </th>
                </tr>

                <tr class="technical-specifications" data-category="review-details">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Review updated</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        -
                    </td>
                    <td data-product-id="10469">
                        -
                    </td>
                    <td data-product-id="10470">
                        -
                    </td>
                </tr>
                <tr class="subheading" data-category="laptop-type-heading">
                    <th>
                <h2>Laptop type</h2>
                </th>
                </tr>

                <tr class="technical-specifications" data-category="laptop-type">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Chromebook</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        No
                    </td>
                    <td data-product-id="10469">
                        No
                    </td>
                    <td data-product-id="10470">
                        No
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="laptop-type">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Convertible laptop</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        Ni
                    </td>
                    <td data-product-id="10469">
                        No
                    </td>
                    <td data-product-id="10470">
                        No
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="laptop-type">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Desktop replacement</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        Yes
                    </td>
                    <td data-product-id="10469">
                        Yes
                    </td>
                    <td data-product-id="10470">
                        Yes
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="laptop-type">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Entry level</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        No
                    </td>
                    <td data-product-id="10469">
                        Yes
                    </td>
                    <td data-product-id="10470">
                        No
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="laptop-type">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Family laptop</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        Yes
                    </td>
                    <td data-product-id="10469">
                        No
                    </td>
                    <td data-product-id="10470">
                        Yes
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="laptop-type">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Multimedia laptop</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        Yes
                    </td>
                    <td data-product-id="10469">
                        No
                    </td>
                    <td data-product-id="10470">
                        No
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="laptop-type">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Ultrabook</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        No
                    </td>
                    <td data-product-id="10469">
                        No
                    </td>
                    <td data-product-id="10470">
                        No
                    </td>
                </tr>
                <tr class="subheading" data-category="processor-memory-storage-heading">
                    <th>
                <h2>Processor, memory, storage</h2>
                </th>
                </tr>

                <tr class="technical-specifications" data-category="processor-memory-storage">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Additional drives</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        DVD-RW
                    </td>
                    <td data-product-id="10469">
                        DVD-RW
                    </td>
                    <td data-product-id="10470">
                        DVD-RW
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="processor-memory-storage">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Additional SSD capacity (GB)</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        60
                    </td>
                    <td data-product-id="10469">
                        -
                    </td>
                    <td data-product-id="10470">
                        -
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="processor-memory-storage">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Main storage type</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        Combo HD 5400
                    </td>
                    <td data-product-id="10469">
                        Spinning HD ns
                    </td>
                    <td data-product-id="10470">
                        Spinning HD 5400
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="processor-memory-storage">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Processor</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        Intel Core i5-4210H
                    </td>
                    <td data-product-id="10469">
                        Intel Celeron N2840
                    </td>
                    <td data-product-id="10470">
                        AMD A8-7410 APU
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="processor-memory-storage">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Processor clock speed (GHz)</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        2.9
                    </td>
                    <td data-product-id="10469">
                        2.16
                    </td>
                    <td data-product-id="10470">
                        2.2
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="processor-memory-storage">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Ram (GB)</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        16
                    </td>
                    <td data-product-id="10469">
                        4
                    </td>
                    <td data-product-id="10470">
                        8
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="processor-memory-storage">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Storage capacity (GB)</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        2060
                    </td>
                    <td data-product-id="10469">
                        500
                    </td>
                    <td data-product-id="10470">
                        1000
                    </td>
                </tr>
                <tr class="subheading" data-category="sound-and-vision-heading">
                    <th>
                <h2>Sound and vision</h2>
                </th>
                </tr>

                <tr class="technical-specifications" data-category="sound-and-vision">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Finish</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        Semi-gloss
                    </td>
                    <td data-product-id="10469">
                        Glossy
                    </td>
                    <td data-product-id="10470">
                        Glossy
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="sound-and-vision">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Graphic adaptor</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        GeForce GTX 950M
                    </td>
                    <td data-product-id="10469">
                        HD Graphics
                    </td>
                    <td data-product-id="10470">
                        AMD Radeon R5 Graphics
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="sound-and-vision">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Headphone port</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        y
                    </td>
                    <td data-product-id="10469">
                        y
                    </td>
                    <td data-product-id="10470">
                        y
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="sound-and-vision">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Microphone port</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        y
                    </td>
                    <td data-product-id="10469">
                        y
                    </td>
                    <td data-product-id="10470">
                        y
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="sound-and-vision">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Resolution (pixels)</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        1920 x 1080
                    </td>
                    <td data-product-id="10469">
                        1366 x 768
                    </td>
                    <td data-product-id="10470">
                        1600 x 900
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="sound-and-vision">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Screen size (inches)</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        17.2
                    </td>
                    <td data-product-id="10469">
                        15.5
                    </td>
                    <td data-product-id="10470">
                        17.2
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="sound-and-vision">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Touchscreen</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        No
                    </td>
                    <td data-product-id="10469">
                        No
                    </td>
                    <td data-product-id="10470">
                        No
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="sound-and-vision">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Webcam</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        Yes
                    </td>
                    <td data-product-id="10469">
                        Yes
                    </td>
                    <td data-product-id="10470">
                        Yes
                    </td>
                </tr>
                <tr class="subheading" data-category="specification-heading">
                    <th>
                <h2>Specification</h2>
                </th>
                </tr>

                <tr class="technical-specifications" data-category="specification">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Dimensions (W x H x D, mm)</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        421 x 27.94 x 293
                    </td>
                    <td data-product-id="10469">
                        378 x 25.5 x 265
                    </td>
                    <td data-product-id="10470">
                        412 x 27.21 x 279
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="specification">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Operating system</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        Windows 10 Home
                    </td>
                    <td data-product-id="10469">
                        Windows 10
                    </td>
                    <td data-product-id="10470">
                        Windows 10 Home
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="specification">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Weight (kg)</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        2.993
                    </td>
                    <td data-product-id="10469">
                        1.976
                    </td>
                    <td data-product-id="10470">
                        2.5749
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="specification">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Transport weight (kg)</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        3.64
                    </td>
                    <td data-product-id="10469">
                        2.15
                    </td>
                    <td data-product-id="10470">
                        2.82
                    </td>
                </tr>
                <tr class="subheading" data-category="software-heading">
                    <th>
                <h2>Software</h2>
                </th>
                </tr>

                <tr class="technical-specifications" data-category="software">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Other application software</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        -
                    </td>
                    <td data-product-id="10469">
                        -
                    </td>
                    <td data-product-id="10470">
                        -
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="software">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Other software</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        -
                    </td>
                    <td data-product-id="10469">
                        -
                    </td>
                    <td data-product-id="10470">
                        -
                    </td>
                </tr>
                <tr class="subheading" data-category="connections-heading">
                    <th>
                <h2>Connections</h2>
                </th>
                </tr>

                <tr class="technical-specifications" data-category="connections">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Ethernet speed (Mbps)</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        1000
                    </td>
                    <td data-product-id="10469">
                        100
                    </td>
                    <td data-product-id="10470">
                        100
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="connections">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">HDMI out</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        1
                    </td>
                    <td data-product-id="10469">
                        1
                    </td>
                    <td data-product-id="10470">
                        1
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="connections">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">USB 2.0</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        2
                    </td>
                    <td data-product-id="10469">
                        1
                    </td>
                    <td data-product-id="10470">
                        2
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="connections">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">USB 3.0</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        2
                    </td>
                    <td data-product-id="10469">
                        1
                    </td>
                    <td data-product-id="10470">
                        1
                    </td>
                </tr>
                <tr class="subheading" data-category="communication-heading">
                    <th>
                <h2>Communication</h2>
                </th>
                </tr>

                <tr class="technical-specifications" data-category="communication">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Bluetooth</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        Yes
                    </td>
                    <td data-product-id="10469">
                        Yes
                    </td>
                    <td data-product-id="10470">
                        Yes
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="communication">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Wireless standard</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        802.11ac
                    </td>
                    <td data-product-id="10469">
                        802.11n
                    </td>
                    <td data-product-id="10470">
                        802.11n
                    </td>
                </tr>
                <tr class="subheading" data-category="similar-models-in-series-heading">
                    <th>
                <h2>Similar models in series</h2>
                </th>
                </tr>

                <tr class="technical-specifications" data-category="similar-models-in-series">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">Less advanced</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        -
                    </td>
                    <td data-product-id="10469">
                        -
                    </td>
                    <td data-product-id="10470">
                        Toshiba Satellite C70D-C-11V with AMD A4 processor
                    </td>
                </tr>
                <tr class="technical-specifications" data-category="similar-models-in-series">
                    <th>
                        <label>
                            <input type="checkbox">
                            <span class="inner-label">More advanced</span>
                        </label>
                    </th>

                    <td data-product-id="10468">
                        Acer Aspire V Nitro VN7-791G with i7 processor
                    </td>
                    <td data-product-id="10469">
                        Lenovo IdeaPad 100 151BY (80QQ) with i3 processor
                    </td>
                    <td data-product-id="10470">
                        -
                    </td>
                </tr>

                </tbody>
            </table><table class="summary fixed-header" style="display: none;">
                <thead>
                    <tr class="action-comparison">
                        <th style="width: 153px;"></th>
                        <th data-product-id="10468" scope="col" style="width: 173px;">
                <form class="frm-comparison frm-remove-comparison" data-product-id="10468" data-location="comparison" data-action-add="/reviews/laptops/compare/add/acer-aspire-v-nitro" data-action-delete="/reviews/laptops/compare/delete/acer-aspire-v-nitro" action="/reviews/laptops/compare/delete/acer-aspire-v-nitro" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="✓"><input type="hidden" name="authenticity_token" value="jllEAMZNqKXVEIqZdaHDRN6JFQZf4Gij6q0Z/v7Gpvy9RvSsZHIuXND5eYp3DqP4iJNxTlwUdAjZnXKrbpy2Ig=="><button name="button" type="submit" class="action-remove icon-close"></button><button name="button" type="submit" class="action-add">Add to compare</button></form>
                </th>
                <th data-product-id="10469" scope="col" style="width: 174px;">
                <form class="frm-comparison frm-remove-comparison" data-product-id="10469" data-location="comparison" data-action-add="/reviews/laptops/compare/add/lenovo-ideapad-100" data-action-delete="/reviews/laptops/compare/delete/lenovo-ideapad-100" action="/reviews/laptops/compare/delete/lenovo-ideapad-100" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="✓"><input type="hidden" name="authenticity_token" value="RmnOgYfvnDmxP4jCx3/SZyZM4lPeGBufEySCWNYWORB1dn4tJdAawLTWe9HF0LLbcFaGG93sBzQgFOkNRkwpzg=="><button name="button" type="submit" class="action-remove icon-close"></button><button name="button" type="submit" class="action-add">Add to compare</button></form>
                </th>
                <th data-product-id="10470" scope="col" style="width: 174px;">
                <form class="frm-comparison frm-remove-comparison" data-product-id="10470" data-location="comparison" data-action-add="/reviews/laptops/compare/add/toshiba-satellite-c70d" data-action-delete="/reviews/laptops/compare/delete/toshiba-satellite-c70d" action="/reviews/laptops/compare/delete/toshiba-satellite-c70d" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="✓"><input type="hidden" name="authenticity_token" value="bojwXUOvF6+hSvxZ/IYMZtOAYemYHDMkO7TsZ4QH+cZdl0Dx4ZCRVqSjD0r+KWzahZoFoZvoL48IhIcyFF3pGA=="><button name="button" type="submit" class="action-remove icon-close"></button><button name="button" type="submit" class="action-add">Add to compare</button></form>
                </th>
                </tr>

                <tr class="product-images">
                    <th class="cont-edit-comparison" scope="row" rowspan="2" style="width: 153px;">
                <div>
                    <button class="edit-list button button-primary-small" type="button" data-track-key="compare_choose_fields">Personalise your comparison
                    </button>
                </div>
                </th>

                <th data-product-id="10468" scope="col" style="width: 173px;">
                <div class="product-image">
                    <a href="/reviews/laptops/acer-aspire-v-nitro">
                        <img class="comparison-product-thumbnail" alt="Acer Aspire V Nitro" src="http://dam.which.co.uk.s3-website-eu-west-1.amazonaws.com/b1da8ace-bf95-41a4-91bc-0547bf54d47f.jpg">
                    </a>
                </div>

                </th>
                <th data-product-id="10469" scope="col" style="width: 174px;">
                <div class="product-image">
                    <a href="/reviews/laptops/lenovo-ideapad-100">
                        <img class="comparison-product-thumbnail" alt="Lenovo IdeaPad 100" src="http://dam.which.co.uk.s3-website-eu-west-1.amazonaws.com/4e99cbd9-fe66-49a2-a57c-d77e809243e9.jpg">
                    </a>
                </div>

                </th>
                <th data-product-id="10470" scope="col" style="width: 174px;">
                <div class="product-image">
                    <a href="/reviews/laptops/toshiba-satellite-c70d">
                        <img class="comparison-product-thumbnail" alt="Toshiba Satellite C70D" src="http://dam.which.co.uk.s3-website-eu-west-1.amazonaws.com/0c4d0d8b-e41d-4430-8ca9-0a6a81deff64.jpg">
                    </a>
                </div>

                </th>
                </tr>

                <tr class="model">
                    <th data-product-id="10468" scope="col" style="width: 173px;">
                <div class="cell-inner-wrapper">
                    <div class="product-details-micro">
                        <div class="name">
                            <span class="manufacturer">Acer</span>
                            <span class="model">Aspire V Nitro</span>
                        </div>
                    </div>
                </div>
                </th>
                <th data-product-id="10469" scope="col" style="width: 174px;">
                <div class="cell-inner-wrapper">
                    <div class="product-details-micro">
                        <div class="name">
                            <span class="manufacturer">Lenovo</span>
                            <span class="model">IdeaPad 100</span>
                        </div>
                    </div>
                </div>
                </th>
                <th data-product-id="10470" scope="col" style="width: 174px;">
                <div class="cell-inner-wrapper">
                    <div class="product-details-micro">
                        <div class="name">
                            <span class="manufacturer">Toshiba</span>
                            <span class="model">Satellite C70D</span>
                        </div>
                    </div>
                </div>
                </th>
                </tr>
                </thead>


            </table>

        </div>

    </body>
</html>
