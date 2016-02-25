package org.rixon.nltt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

@Configuration
public class FreemarkerConfig extends FreeMarkerConfigurer {
    public FreemarkerConfig() {
    	setTemplateLoaderPath("/WEB-INF/templates/");
    	setDefaultEncoding("UTF-8");
    }
}
