package com.klymchuk;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {
	
	//-javaagent:{SPRING-LOADED-HOME}/springloaded-{SPRING-LOADED-VERSION}.RELEASE.jar -noverify
    public static void main( String[] args ) {
    	ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println( "Hello Boot!" );
        
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
