package com.turreta.githubjenkins.ci.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComTurretaGithubjenkinsCiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComTurretaGithubjenkinsCiDemoApplication.class, args);
		System.out.println("Test Jenkins build triggers");
		System.out.println("Pushed from GitHub Desktop!");
	}
}
