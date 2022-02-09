package co.edu.iudigital.config;

import java.beans.BeanProperty;
import java.nio.file.Paths;
import java.util.Collections;

import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**
 * configuracion de swager
 * @author alber
 *
 */

@Cofiguration
@EnableSwager2
public class SwagerConfig {
	
	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors
				     .basePackage("co.edu.iudigital.app.controller")
				 )
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
					
	}
	
	public ApiInfo apiInfo() {
		return new ApiInfo(
				"API de HelpUID", 
				"API para la App de HelpMeUID", 
				"1.0", 
				"https://iudigital.edu.co", 
				new Contact(
						"Alberto Calle",
				 		"https://iudigital.edu.co",
				 		"alberto.calle@est.iudigital.edu.co"),
				"Apache 2.0", 
				"https://www.apache.org/licence/LICENCE-2.0.html",
				Collections.EMPTY_LIST
				);
	}
}
