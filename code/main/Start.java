package main;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

class Start {
    public static void main(String[] args) {
        ApplicationContext context; 
        context = SpringApplication.run(Setup.class);
        String[] all = context.getBeanDefinitionNames();
        for (int i = 0; i < all.length; i++) 
            System.out.println(all[i]);
    }
}