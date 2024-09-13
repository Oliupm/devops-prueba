package es.upm.miw.iwvg_devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import PaquetePruebas.Experiment;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class}) // Not API: /error
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);// mvnw clean spring-boot:run

        int num = 1;

        Experiment pr = new Experiment(num);
        System.out.println(pr.getNumber());
        System.out.println("Fraction");
        System.out.println("User");
        System.out.println("UserTest");
    }
}
