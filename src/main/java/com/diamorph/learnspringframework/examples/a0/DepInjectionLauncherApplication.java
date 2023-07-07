package com.diamorph.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.diamorph.learnspringframework.examples.a0")
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {

        try(
            AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext
                            (DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }
    }
}
