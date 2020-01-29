package com.jpa;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class HibernateSpringBootAssignSequentialNumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringBootAssignSequentialNumberApplication.class, args);
	}
	
	private final BookStoreService bookStoreService;

	public HibernateSpringBootAssignSequentialNumberApplication(BookStoreService bookStoreService) {
		super();	
		this.bookStoreService = bookStoreService;
	}
	
	@Bean
	public ApplicationRunner init() {
		return args -> {
			System.out.println("\n\nUsing ORDER BY only in OVER:");
			bookStoreService.fetchWithSeqNumber1();
		};
	}
}
