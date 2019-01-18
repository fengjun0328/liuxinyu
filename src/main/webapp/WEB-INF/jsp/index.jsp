<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
  <head>
    
    <title>表单</title>
	
  </head>
  
  <body>
   <div  style="margin: 0 auto;">

			    <table>
			    	<tr>
			    	<th>编号</th>
			    	<th>账号</th>
			    	<th>密码</th>

			    	</tr>
			    	
			<c:forEach  items="${user}" var="user">
					<tr>
			    	<th>${user.id}</th>
			    	<th>${user.name}</th>
			    	<th>${user.pwd}</th>
			    	</tr>
			</c:forEach>
			    </table>
			    
	</div>   
  </body>
</html>
