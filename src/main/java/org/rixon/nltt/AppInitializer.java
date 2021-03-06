package org.rixon.nltt;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
 
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import java.util.logging.Logger;
 
public class AppInitializer implements WebApplicationInitializer {
 
    private static final String CONFIG_LOCATION = "org.rixon.nltt.config";
    private final static Logger log = Logger.getLogger(AppInitializer.class.getName()); 
 
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append("\n\n\n");
    	sb.append("**********************************************************************\n");
    	sb.append("*                                                                    *\n");
    	sb.append("* http://localhost:8080/                                             *\n");
    	sb.append("*                                                                    *\n");
    	sb.append("**********************************************************************\n");
    	sb.append("\n\n\n");
        log.info(sb.toString());
 
        // Create ApplicationContext
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.setConfigLocation(CONFIG_LOCATION);
 
        // Add the servlet mapping manually and make it initialize automatically
        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
        ServletRegistration.Dynamic servlet = servletContext.addServlet("DispatcherServlet", dispatcherServlet);
 
        servlet.addMapping("/*");
        servlet.setAsyncSupported(true);
        servlet.setLoadOnStartup(1);
    }
}
