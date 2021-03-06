package com.franktran.masteringspringboot;

import com.franktran.masteringspringboot.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class WebConfiguration {

    @Value("${info.author.name}")
    private String author;

    @Autowired
    private Environment environment;

    @Bean
    public CommandLineRunner commandLineRunner(InfoApp infoApp) {
        return args -> {
            System.out.println(author);
            System.out.println(environment.getProperty("info.app.version"));

            System.out.println(infoApp);
        };
    }
}
