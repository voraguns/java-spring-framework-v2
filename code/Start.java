
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.SpringVersion;


@Love(city="Bangkok")
class Start {
    
    @ShowLog()
    
    public static void main(String[] data) {
        ApplicationContext context;
        context = new AnnotationConfigApplicationContext();
        User u = new User();
    }
}

@Deprecated
class User {
    int id;
    @Deprecated String name;
    String email;
}

class Member {
    
}

// Create Annotation by myself
@interface Love {
    String city();
}

@interface ShowLog { }