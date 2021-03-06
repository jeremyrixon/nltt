package org.rixon.nltt.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rixon.nltt.config.db.H2DataSource;
import org.rixon.nltt.controller.BookController;
import org.rixon.nltt.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.ui.ModelMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ BookController.class, H2DataSource.class }, loader=AnnotationConfigContextLoader.class)
public class BookControllerTest {

    @Autowired
    private BookController bookController;

    @SuppressWarnings("unchecked")
	@Test
    public void testBookController() {
    	ModelMap modelMap = new ModelMap();
    	bookController.index(modelMap);
    	assertTrue(modelMap.containsAttribute("bookList"));
    	Object obj = modelMap.get("bookList");
    	assertTrue(obj instanceof List);
    	List<Book> bookList = (List<Book>) obj;
    	assertNotEquals(0, bookList.size());
    };
}