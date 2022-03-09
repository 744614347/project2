package com.web.project2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource(locations = {"classpath:/kaptcha.xml"})
@ServletComponentScan
public class Project2Application {

    public static void main(String[] args) {
        SpringApplication.run(Project2Application.class, args);
    }


}

