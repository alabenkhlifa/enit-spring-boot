package tn.ensit.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public IJavaController javaControllerBean() {
        return new JavaController();
    }
}
