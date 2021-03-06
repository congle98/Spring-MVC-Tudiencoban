package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("controller")
public class WebConfig implements WebMvcConfigurer {
@Bean
    InternalResourceViewResolver resolver(){
    InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
    internalResourceViewResolver.setSuffix(".jsp");
    internalResourceViewResolver.setPrefix("/WEB-INF/views/");
    return internalResourceViewResolver;
}

}
