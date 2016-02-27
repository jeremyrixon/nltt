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
	   <div>
		  <br/>
		  <table id="users" class="table table-hover people">
		    <tr>
				<th>Name</th>
				<th>Phone</th>
				<th>Email</th>
		    </tr>
		    <#list model["userList"] as user>
		    <tr id=${user.id}>
		        <td>${user.name}</td>
		        <td>${user.phone}</td>
		        <td>${user.email}</td>
		    </tr>
		    </#list>
		  </table>
	   </div> 
    </div>
    <#include "shared/footer.ftl">
    <script src="/resources/js/people-table.js"></script>
  </body>
</html>
