package info.yeasin.springcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcrudApplication {

    public static void main(String[] args) {
       // SpringApplication.run(SpringcrudApplication.class, args);
        ApplicationContext con = SpringApplication.run(SpringcrudApplication.class,args);
        Person person = con.getBean(Person.class);
        person.speak();
        person.food.recipes();
    }


}


