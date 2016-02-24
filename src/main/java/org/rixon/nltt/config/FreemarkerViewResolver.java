package org.rixon.nltt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
public class FreemarkerViewResolver extends FreeMarkerViewResolver {
	
	public FreemarkerViewResolver() {
		setCache(true);
		setPrefix("/");
		setSuffix(".ftl");
	}

}
