package main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
class Setup {
    @Bean("captain")
    Player create() {
        return new Player();
    }
}