<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <link rel="stylesheet" href="css/style4.css">
<body>
<section>
<div class="form-box">
  <div class="form-value">
  
  <form action="<%=request.getContextPath()%>/register" method="post">
  <h2 style="text-align: center;">Travel Alloence</h2>
  
  <div class="form-group " >
    <label for="company">Amount</label>
    <input type="number" class="form-control" name="amount"  placeholder="Enter the  amount">
  </div>

 <div >
  <textarea  type="text" cols="36" rows="6" name="description" placeholder="Description"></textarea></br>
  </div>
  
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
  </div>
</div>
</section>

</body>
</html>