
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.SpringVersion;


class Start {
    
    public static void main(String[] data) {
        System.out.println(SpringVersion.getVersion());
        ApplicationContext context;
        context = new AnnotationConfigApplicationContext(Setup.class);
        String[] all = context.getBeanDefinitionNames();
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
        
        Player p = context.getBean("goal-keeper", Player.class);
        System.out.println(p.name);
    }
}

class Player {
    String name;
    int number;
    double salary;
}

@Configuration
class Setup {           // Configuration class
    
    @Bean("captain")
    Player create() {
        Player p = new Player();
        p.name = "Harry Karn";
        p.number = 10;
        p.salary = 75000.0;
        return p;
    }
    
    @Bean("goal-keeper")
    Player create2() {
        Player p = new Player();
        p.name = "Peter Check";
        p.number = 1;
        p.salary = 40000.0;
        return p;
    }
    
    @Bean
    Cashier cashier() {
        Cashier c = new Cashier();
        c.tax = 15.0;
        c.name = "Susan W";
        return c;
    }
}

class Cashier {
    double tax;
    String name;
}