<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<title>Distributed Storage</title>
</head>
<%
String mysession=(String)session.getAttribute("login");
%>
<link rel="stylesheet" type="text/css" href="css/page_style.css" media="screen" />
<div id="wrapper">
<form name="LogOut" method="GET" action="LogOut" class="login-form">
<%
              if(mysession!=null){
              %>
 				<div class="header">
    				<center><h1>Hello, ${login}</h1></center>
   				 </div>
   				 <div class="footer">
               		<input type="submit" class="button1" value="LogOut"/>
               	</div>
                            <%
              } else {
            	%>
            	<div class="header">
    				<center><h1>Sorry :(</h1></center>
    				</div>
    				<div class="footer">
    				<button class="button1"><a href = "index.jsp">Go back</a></button>
   				 </div>
            	<% } %>
            	</form>
</div>
<div class="gradient"></div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="https://crypto-js.googlecode.com/svn/tags/3.1.2/build/rollups/md5.js"></script>
</html>