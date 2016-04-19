<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : compLapSche.xsl
    Created on : April 18, 2016, 12:35 PM
    Author     : HongLinh
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" indent="yes"/>
    <xsl:template match="/">
        <xsl:apply-templates />
    </xsl:template>
    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="listLapComp">
        <xsl:for-each select="laptopCompareJAXB">
            <li>
                <header class="cd-pricing-header">
                    <h3><xsl:value-of select="name"/></h3>
                    <div class="cd-price">
                        <img class="avatar">
                            <xsl:attribute name="src">
                                <xsl:value-of select="avatar"/>
                            </xsl:attribute>
                        </img>
                    </div>
                </header> <!-- .cd-pricing-header -->

                <div class="cd-pricing-body">
                    <ul class="cd-pricing-features">
                        <li><xsl:value-of select="cpuName"/>(<em><xsl:value-of select="cpuMark"/></em>)</li>
                        <li><xsl:value-of select="ramSize"/> GB</li>
                        <li><xsl:value-of select="hddSize"/> GB</li>
                        <li><xsl:value-of select="ssdSize"/> GB</li>
                        <li><xsl:value-of select="videoCardName"/> (<em><xsl:value-of select="videoCardMark"/></em>)</li>
                        <li><xsl:value-of select="screenSize"/> inch</li>
                        <li><xsl:value-of select="weight"/> kg</li>
                    </ul>
                </div> 
            </li>
        </xsl:for-each>
    </xsl:template>

</xsl:stylesheet>
