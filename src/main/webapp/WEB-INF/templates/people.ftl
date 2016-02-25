<!DOCTYPE html>
<html lang="en">
  <#include "shared/head.ftl">
  <body>
  <#include "shared/navbar.ftl">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h2>People</h2>
        <p>A list of people is below. </p>
      </div>
    </div>
    <div class="container" role="main">
		<div id="users">
		  <br/>
		  <table class="table">
		    <tr>
		        <th>Id</th>
				<th>Name</th>
				<th>Phone</th>
				<th>Email</th>
		    </tr>
		    <#list model["userList"] as user>
		    <tr>
		        <td>${user.id}</td>
		        <td>${user.name}</td>
		        <td>${user.phone}</td>
		        <td>${user.email}</td>
		    </tr>
		    </#list>
		  </table>
	</div> 
    </div><!-- /.container -->
  <#include "shared/navbar.ftl">
  </body>
</html>
<html>
<body>
