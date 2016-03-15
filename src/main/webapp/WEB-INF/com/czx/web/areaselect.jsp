<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>省、市、区下拉框</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="common/plugin/jquery/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="common/plugin/city/areaselect.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#pccDiv").areaselect();
		})
		
	</script>
  </head>
  
  <body>
    <div class="formControls col-10" id="pccDiv">
	  	<select class="select" name="province"></select>
	    <select class="select" name="city"></select>
	    <select class="select" name="county"></select>
	</div>
  </body>
</html>
