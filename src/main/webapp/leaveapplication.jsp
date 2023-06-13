<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="css/style3.css">
<meta charset="ISO-8859-1">
<title>Leave</title>
</head>
<body>
  <div class = "container">
    <div class = "row">
          <div class = "apply-leave-container">
            <form action="<%=request.getContextPath()%>/leave" method="post">
              <h2>Apply Leave</h2><br/>
              <input class="form-control" id="inputdefault" type="text" name="name" placeholder="Employee Name">
             
			<div class="form-group ">
              <label for="exampleInputPassword1">Start Date</label>
              <input type="date" name="from_date">
              <label for="exampleInputPassword1">End Date</label>
              <input type="date" name="to_date">
              </div>
             <div>
              <textarea  type="text"  class="area1" cols="27" rows="1" placeholder="Reason" name="empreason"></textarea><br>
             </div>
              <button type="submit" class="btn btn-primary">Submit</button>
            </form>
          </div>
      </div>
    </div>
  


</body>
</html>


</body>
</html>