package org.rixon.nltt.config;

import java.util.logging.Logger;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

@Configuration
public class FreemarkerConfig extends FreeMarkerConfigurer {
    private final static Logger log = Logger.getLogger(FreemarkerConfig.class.getName()); 
    
    public FreemarkerConfig() {
    	setTemplateLoaderPath("/WEB-INF/templates/");
    	setDefaultEncoding("UTF-8");
    }
}
