<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <title>Urlrewrite Simple Demo</title>
 </head>
 <body>
  <h3>/welcome.jsp</h3>
  <HR/>
  <p>
   <a href="index.html" target="_blank">/index.html</a>
  </p>
  <p>
   <a href="index.action" target="_blank">/index.action</a>
  </p>
  <p>
   <a href="user/param/fancy/8080.do" target="_blank">/user/param/fancy/8080.do</a>(forward[转发模式])
  </p>
  <p>
   <a href="admin/param/fancy/8080.do" target="_blank">/user/param/fancy/8080.do</a>(redirect[重定向模式])
  </p>
  <p>
   <a href="m/param/g_fancy/8080.do" target="_blank">/user/param/fancy/8080.do</a>
  </p>
 </body>
</html>