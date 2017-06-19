<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table border="1" width="600" height="500">
			<tr>
				<td colspan="2" height="100">
					<tiles:insertAttribute name="header"/><!--include에 해당  -->
				</td>
			</tr>
			<tr>
				<td width="200" height="300">
					<tiles:insertAttribute name="nav"/>
				</td>
				<td width="400" height="300">
					<tiles:insertAttribute name="body"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" height="100">
					<tiles:insertAttribute name="footer"/>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>