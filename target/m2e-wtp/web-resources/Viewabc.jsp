
<%@page import="customer.dao.View"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Selection</title>
</head>
<body>
<h2>Select</h2>
<fieldset>
<table>
<s:iterator value="Cities">
<tr>
<s:radio list="selectedcity"></s:radio>
<td><s:property value="cityCode"/></td>
<td><s:property value="cityName"/></td>
<td><s:property value="country"/></td>

</tr>
</s:iterator>
<tr><td><s:submit value="submit" name="submit" />
</td>
</tr>
</table>

</fieldset>

</body>
</html>