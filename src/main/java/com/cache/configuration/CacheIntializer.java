package com.cache.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Registers DispatcherServlet which initiallizes Spring container for web environment
 * @author ppatro
 *
 */
public class CacheIntializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(AppConfig.class);
		webApplicationContext.setServletContext(servletContext);
		//webApplicationContext.refresh();
		//servletContext.addListener(new ContextLoaderListener(webApplicationContext));
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet",
				new DispatcherServlet(webApplicationContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/*");
	}

}
