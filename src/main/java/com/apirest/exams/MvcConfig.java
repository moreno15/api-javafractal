package com.apirest.exams;
 
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry; 
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer; 

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	  
	
	/*CORS Global Settings
	  define some global CORS configuration.*/
	@Bean
    public WebMvcConfigurer corsConfigurer() { 
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/v1/**") 
                
                 .allowedOrigins( "http://192.168.100.5:4200","https://app-fractalweb-test.herokuapp.com" ) // CAMBIAR CON DOMINIO DEL FRONTEND 
                 .allowedMethods("GET","POST","PUT","DELETE") 
	           	 .maxAge(3600);
            }
        };
    }
	
	 
	 
}
