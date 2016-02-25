<!DOCTYPE html>
<html lang="en">
  <#include "shared/head.ftl">
  <body>
  <#include "shared/navbar.ftl">

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h2>Books</h2>
        <p>A list of books is below. </p>
      </div>
    </div>
    <div class="container" role="main">
		<div id="books">
		  <br/>
		  <table class="table">
		    <tr>
		        <th>Id</th>
				<th>Title</th>
				<th>Author</th>
				<th>ISBN</th>
		    </tr>
		    <#list model["bookList"] as book>
		    <tr>
		        <td>${book.id}</td>
		        <td>${book.title}</td>
		        <td>${book.author}</td>
		        <td>${book.ISBN}</td>
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
