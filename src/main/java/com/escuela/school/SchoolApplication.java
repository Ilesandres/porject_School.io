package com.escuela.school;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

	//inserto un nuevo documento student en la base de datps school
	@Bean
	CommandLineRunner runner(StudentRepository studentRepository){

		return args -> {
			Student student= new Student(
					"Carmen",
					23,
					3.5,
					true
			);
			studentRepository.insert(student);

		};



	}

}
