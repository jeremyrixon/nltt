package org.rixon.nltt.controller;

import java.util.List;

import javax.sql.DataSource;

import org.rixon.nltt.dao.PersonDao;
import org.rixon.nltt.model.Person;
import org.skife.jdbi.v2.DBI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class PeopleController {
	
	@Autowired
	private DataSource dataSource;

	@RequestMapping(value = "people", method = RequestMethod.GET)
    public String index(@ModelAttribute("model") ModelMap model) {
 
    	DBI dbi = new DBI(dataSource);

    	PersonDao personDao = dbi.open(PersonDao.class);
    	List<Person> persons = personDao.findAll();
    	personDao.close();
    	model.addAttribute("personList", persons);
 
    	return "people";
    }

}