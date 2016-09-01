package org.conversor.config;

import org.conversor.controller.NumerosRomanosController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@EnableWebMvc 
@ComponentScan(basePackageClasses={NumerosRomanosController.class}) 
public class AppWebConfigurations {
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	/*@Bean
    public SimpleMappingExceptionResolver createSimpleMappingExceptionResolver() {
      SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
      Properties errorMaps = new Properties();
      errorMaps.setProperty("Excessoes", "error");
      errorMaps.setProperty("NullPointerException", "error");
      resolver.setExceptionMappings(errorMaps);
      resolver.setDefaultErrorView("globalerror");
      resolver.setExceptionAttribute("exc");
      return resolver;
   }*/

}
