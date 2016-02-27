package org.rixon.nltt.controller.rest;
import java.util.List;

import javax.sql.DataSource;

import org.rixon.nltt.dao.BookDao;
import org.rixon.nltt.model.Book;
import org.skife.jdbi.v2.DBI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {
	
	@Autowired
	private DataSource dataSource;

    @RequestMapping("/person/{id}/books")
    public List<Book> booksForPerson(@PathVariable(value="id") int id) {
    	
    	DBI dbi = new DBI(dataSource);

    	BookDao bookDao = dbi.open(BookDao.class);
    	List<Book> books = bookDao.findByPerson(id);
    	bookDao.close();
    	
        return books;
    }
}