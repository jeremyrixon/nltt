package org.rixon.nltt.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class FreeMarkerViewResolver extends org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver {
	
	public FreeMarkerViewResolver() {
		setCache(true);
		setPrefix("/");
		setSuffix(".ftl");
	}
	

}
