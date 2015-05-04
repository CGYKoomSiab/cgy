<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search TUTORIAL</title>
</head>
<body>
<!-- 
<form action="tutorials/getTutorial.action" method="post">
	<input id="language" name="language"/>
	<input type="submit"/>
</form>-->

<s:form action="tutorials/getTutorial">
	<s:textfield key="language" label="Enter the language you want to search for"/>
	<s:submit />
</s:form>

</body>
</html>