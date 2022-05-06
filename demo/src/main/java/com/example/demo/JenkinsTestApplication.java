package com.example.demo;

import com.example.demo.entity.BookEntity;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JenkinsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

    @Bean
    public CommandLineRunner sampleData(BookRepository repository){
        return args -> {
            repository.save(new BookEntity("Polar Bear","Mark Twain"));
        };
    }
}
