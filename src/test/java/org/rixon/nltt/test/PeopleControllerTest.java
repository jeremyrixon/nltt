package org.rixon.nltt.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rixon.nltt.config.db.H2DataSource;
import org.rixon.nltt.controller.PeopleController;
import org.rixon.nltt.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.ui.ModelMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ PeopleController.class, H2DataSource.class }, loader=AnnotationConfigContextLoader.class)
public class PeopleControllerTest {

    @Autowired
    private PeopleController peopleController;

    @SuppressWarnings("unchecked")
	@Test
    public void testPeopleController() {
    	ModelMap modelMap = new ModelMap();
    	peopleController.index(modelMap);
    	assertTrue(modelMap.containsAttribute("personList"));
    	Object obj = modelMap.get("personList");
    	assertTrue(obj instanceof List);
    	List<Person> personList = (List<Person>) obj;
    	assertNotEquals(0, personList.size());
    };
}