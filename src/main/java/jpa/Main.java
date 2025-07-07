package jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(PersonRepository repository) {
        return args -> {
            Person person = new Person();
            person.setName("Carlos");

            repository.save(person);
            Person saved = repository.findById(person.getId().orElseThrow(NoSuchElementException::new));
        };
    }
}
