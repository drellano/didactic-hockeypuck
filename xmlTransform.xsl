<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
  <body>
<!-- 
loop for each main node to print name and look inside-->
  <xsl:for-each select="*">
	<p><xsl:value-of select="name(.)"/></p>
<!-- 
loop for each main nodes children to print name and look inside-->		
	<xsl:for-each select="*">
	<p><xsl:value-of select="name(.)"/></p>	
<!-- 
creates table-->
	<table>
<!-- 
builds first row with names of each sub heading-->
	<tr>
	<xsl:for-each select="*">
<!-- 
filters for elements with children-->
	<xsl:choose>
  	<xsl:when test="*">
	<xsl:for-each select="*">
	<td>
	<xsl:value-of select="name(.)"/>
	</td>
	</xsl:for-each>
 	 </xsl:when>
  	<xsl:otherwise>
	<td>
	<xsl:value-of select="name(.)"/>
	</td>
  	</xsl:otherwise>
	</xsl:choose>
	
	</xsl:for-each>
	</tr>
<!-- 
builds second row with names of each sub headings value-->
	<tr>
	<xsl:for-each select="*">
<!-- 
filters for elements with children-->
	<xsl:choose>
  	<xsl:when test="*">
	<xsl:for-each select="*">
	<td>
	<xsl:value-of select="node()"/>
	</td>
	</xsl:for-each>
 	 </xsl:when>
  	<xsl:otherwise>
	<td>
	<xsl:value-of select="node()"/>
	</td>
  	</xsl:otherwise>
	</xsl:choose>
	
	</xsl:for-each>
	</tr>
	</table>
        </xsl:for-each>
  </xsl:for-each>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>
