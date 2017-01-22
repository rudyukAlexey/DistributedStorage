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

  <form name="myform" class="login-form" method="POST" onsubmit="return OnSubmitForm();" >
  <input type="hidden" name="command" value ="AddUser"/>
    <div class="header">
    <center><h1>Bachelor Work</h1></center>
    <center><span>designed by Rudyuk Alexey</span></center>
    </div>
  
    <div class="content">
    <input id="login" name="login" type="text" class="input username" placeholder="Введіть логін" />
    <div class="user-icon"></div>
    <input id="password" name="password" type="password" class="input password" placeholder="Введіть пароль" />
    <div class="pass-icon"></div>  
    <span id="myStatus" style="color: #f00; font-size: 10pt; position:relative; top: 10px;"></span>
    </div>

    <div class="footer">
    <input type="submit" name="Operation" onClick="document.pressed=this.value" value="Login" class="button" />
    <input type="submit" name="Operation" onClick="document.pressed=this.value" value="Register" class="register" />
    </div>
  
  </form>
</div>
<div class="gradient"></div>
<script>

function OnSubmitForm() {
if(document.pressed == 'Register') {
document.myform.action ="AddUser";
} else if(document.pressed == 'Login') {
document.myform.action ="CheckUser";
}
return true;
}

</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="https://crypto-js.googlecode.com/svn/tags/3.1.2/build/rollups/md5.js"></script>
</html>