package com.example.Wyk02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Wyk02Application {

	public static void main(String[] args) {
		SpringApplication.run(Wyk02Application.class, args);
	}

	@Autowired
	private AnimalRepo animalRepo;

	@EventListener(ApplicationReadyEvent.class)
	public void init()
	{
		animalRepo.save(new Animal("kot"));
		animalRepo.save(new Animal("pies"));
	}
}
