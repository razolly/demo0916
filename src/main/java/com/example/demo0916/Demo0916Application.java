package com.example.demo0916;

import com.example.demo0916.entity.Quote;
import com.example.demo0916.repository.QuoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo0916Application {

	 private static final Logger log = LoggerFactory.getLogger(Demo0916Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo0916Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(QuoteRepository repository) {
		return (args) -> {
			repository.save(new Quote("Hello world0", "Razli1"));
			repository.save(new Quote("Hello world1", "Razli2"));
			repository.save(new Quote("Hello world2", "Razli2"));
			repository.save(new Quote("Hello world3", "Razli4"));
			repository.save(new Quote("Hello world4", "Razli5"));
			repository.save(new Quote("Hello world5", "Razli6"));

			for (Quote eachQuote: repository.findAll()) {
				log.info(eachQuote.getContent());
			}
		};
	}
}
