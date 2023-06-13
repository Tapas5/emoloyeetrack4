<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
		String driver = "com.mysql.jdbc.Driver";
		String connectionUrl = "jdbc:mysql://localhost:3306/employees";
		String userid = "root";
		String password = "";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>

<body>
	<table class="table w-78%">
		<tr>
			<td>Id</td>
			<td>Place</td>
			<td>Company</td>
			<td>Time</td>
			<td>Date</td>
		</tr>


		<%
try{
Connection con = DriverManager.getConnection(connectionUrl,userid,password);
statement=con.createStatement();
String sql="select * from meeting";
resultSet = statement.executeQuery(sql);
int i =0;
while(resultSet.next()){
%>
		<tr>
			<td><%=resultSet.getString("id") %></td>
			<td><%=resultSet.getString("place") %></td>
			<td><%=resultSet.getString("company") %></td>
			<td><%=resultSet.getString("time") %></td>
			<td><%=resultSet.getString("date") %></td>
			<td><a href=""><button type="button" class="btn btn-primary pr-3">Approved</button></a></td>
			<td><a href=""><button type="button" class="btn btn-warning">Pending</button></a></td>
			<td><a href=""><button type="button" class="btn btn-danger">Rejected</button></a></td>
			




		</tr>
		<%
		i++;
		}
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		%>


	</table>

</body>
</html>