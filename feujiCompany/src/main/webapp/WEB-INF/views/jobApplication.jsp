<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <html>
 <body>
 <form:form method="POST" action="/feujiCompany/applicationForm" modelAttribute="application" >
 
   <table>
      	   <tr>
      	      <td>Enter FirstName:</td>
      	      <td><form:input type="text" path="firstName" name="firstName"/></td>
      	   </tr>
      	    <tr>
        		<td>Enter LastName:</td>
        		<td><form:input type="text" path="lastName"/></td>
        	</tr>
        	<tr>
        		<td>Enter MblNo:</td>
        		<td><form:input type="text" path="mblNo"/></td>
        	</tr>
        	<tr>
        		<td>Enter Mail:</td>
        		<td><form:input type="text" path="email"/></td>
        	</tr>
        	<tr>
        		<td>Enter Higher Education:</td>
        		<td><form:input type="text" path="education"/></td>
        	</tr>
        	<tr>
        		<td>Enter Percentage:</td>
        		<td><form:input type="text" path="percentage"/></td>
        	</tr>
        	<tr>
        		<td>Enter Location:</td>
        		<td><form:input type="text" path="location"/></td>
        	</tr> 
        	<tr><td>
        	<input type="submit"></input>
        	</td></tr>
      	</table>
      	</form:form>
      </body>
 </html>