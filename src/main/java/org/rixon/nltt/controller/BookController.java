package org.rixon.nltt.controller;

import java.util.List;

import javax.sql.DataSource;

import org.rixon.nltt.dao.BookDao;
import org.rixon.nltt.model.Book;
import org.skife.jdbi.v2.DBI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class BookController {
	
	@Autowired
	private DataSource dataSource;

	@RequestMapping(value = "books", method = RequestMethod.GET)
    public String index(@ModelAttribute("model") ModelMap model) {
 
    	DBI dbi = new DBI(dataSource);

    	BookDao bookDao = dbi.open(BookDao.class);
    	List<Book> books = bookDao.findAll();
    	bookDao.close();
    	model.addAttribute("bookList", books);
 
    	return "books";
    }

}