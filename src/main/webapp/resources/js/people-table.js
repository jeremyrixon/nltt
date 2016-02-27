$( document ).ready(function() {
  $('#people tr').click(function(e) {
  	if ($(this).next().hasClass('bookrow')) {
  	  var table = $(this).next();
  	  table.fadeOut(function() {
  	     table.remove();
  	  });
  	} else {
  	  var personid = $(this).attr('id');
  	  if (personid) {
	  	  var tr = $('<tr class="bookrow"></tr>');
	  	  var td2 = $('<td colspan="3" class="booklist"></td>');
	  	  tr.append(td2);
	  	  $(this).after(tr);
	  	  
	  	  // td2.html('<i>Loading Books...</i>');
	  	  
	  	  $.getJSON( '/person/' + personid + '/books', function( json ) {
	  	    if (json.length == 0) {
	  	      var p = $('<p>This person currently has no books.</p>');
		      p.hide();
		      td2.html(p);
		      p.fadeIn();
	  	    } else {
		  	  var table = $('<table class="booksinline table"></table>');
		  	  table.append('<tr><th>Title</th><th>Author</th><th>ISBN</th></tr>');
		      $.each(json, function(i, o) {
		        table.append('<tr><td>' + o.title + '</td><td>' + o.author + '</td><td>' + o.isbn + '</td></tr>');
		      });
		      table.hide();
		      td2.html(table);
		      table.fadeIn();
		    }
		  })
		  .fail(function( jqxhr, textStatus, error ) {
		    td2.text("Unfortunately, an error has occured: (" + textStatus + ") " + error + ".");
		  });
	  }
	}
  });
});