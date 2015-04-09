<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> 
<style>
          body { background: lightgray; }
          a { background: white; }
          h3  {color:orange}
          
          .dropdown-menu{
          margin-left:%;
                  
          
          }
        </style>
        <script>
   $(function(){
      $(".dropdown-toggle").dropdown('toggle');
      }); 
</script>

<title> </title>
</head>
<body>
<form action="home">
<h3 align="center">Property Allotment System </h3>
<div class="nav" align="center" >
<ul>
<li class="dropdown"><a href="#" data-toggle="dropdown">View</a> |
<ul class="dropdown-menu" >
<li><a href="City">City</a></li>
<li><a href="locations">Locations</a></li>
<li><a href="Builders">Builders</a></li>
<li><a href="Schemes">Schemes</a></li>
<li><a href="Apartment">Apartment</a></li>
</ul>


<a href="Buy">Buy</a> | 

<a href="Register">Register</a> |
<a href="Maps">Maps</a> |
<a href="About us">About us</a> |
<a href="Contact us">Contact us</a> |
<a href="Register">Register</a> |
<a href="Login.jsp">Login</a> | 
</li>
</ul>
</div>
<s:div class="container">
<s:form class="navbar-form navbar-left" role="search">

    <div class="form-group">

        <s:textfield class="form-control" placeholder="Search" value="search"></s:textfield>
        
        
    <button type="submit" class="btn btn-default">Submit</button>

    </div>


</s:form>
</s:div>
</form>


</body>
</html>