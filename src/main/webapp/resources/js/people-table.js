$( document ).ready(function() {
  $('#users tr').click(function() {
  	if ($(this).next().hasClass('bookrow')) {
  	  $(this).next().remove();
  	} else {
  	  var personid = $(this).attr('id');
  	  if (personid) {
	  	  var tr = $('<tr class="bookrow"></tr>');
	  	  var td2 = $('<td colspan="3" class="booklist"></td>');
	  	  tr.append(td2);
	  	  $(this).after(tr);
	  	  td2.html('<i>Loading Books...</i>');
	  	  
	  	  $.getJSON( '/user/' + personid + '/books', function( json ) {
	  	    if (json.length == 0) {
	  	      td2.text('This person currently has no books.');
	  	    } else {
		  	  var table = $('<table class="table"></table');
		  	  table.append('<tr><th>Title</th><th>Author</th><th>ISBN</th></tr>');
		      $.each(json, function(i, o) {
		        table.append('<tr><td>' + o.title + '</td><td>' + o.author + '</td><td>' + o.isbn + '</td></tr>');
		      });
		      td2.html(table);
		    }
		  })
		  .fail(function( jqxhr, textStatus, error ) {
		    td2.text("Unfortunately, an error has occured: (" + textStatus + ") " + error + ".");
		  });
	  }
	}
  });
});