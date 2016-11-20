/* Spring Boot Way of Configuring Web.xml File */

package com.naironics.forageapp.config;
 
import com.naironics.forageapp.ForageApplication;
 
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class WebXmlConfiguration extends SpringBootServletInitializer {
 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ForageApplication.class);
    }
}