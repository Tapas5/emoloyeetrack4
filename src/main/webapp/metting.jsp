<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="css/style2.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

<section>
<div class="form-box">
  <div class="form-value">
  
  <form action="<%=request.getContextPath()%>/meeting" method="post">
  <h2 style="text-align: center;">Meeting Details</h2>
  <div class="form-group top">
    <label for="exampleInputEmail1">Place</label>
    <input type="text" class="form-control" id="place" name="place" placeholder="Enter the meeting place..">
    
  </div>
  <div class="form-group " >
    <label for="company">Company</label>
    <input type="text" class="form-control" id="whome" name="company" placeholder="Enter the company name">
  </div>
  <div class="form-group ">
    <label for="exampleInputPassword1">Time</label>
    <input type="time" class="form-control" id="time" name="time" placeholder="Enter the time">
  </div>
  <div class="form-group ">
  <label for="exampleInputPassword1">Meeting Date</label>
      <input type = "date" name="date">   
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
  </div>
</div>
</section>


</body>
</html>