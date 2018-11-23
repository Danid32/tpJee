package fr.ril17.danid.demo;

import fr.ril17.danid.demo.service.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpdanidApplication {


    @Autowired
    private DataLoader dataLoader;

    public static void main(String[] args) {
        SpringApplication.run(TpdanidApplication.class, args);
    }
}
