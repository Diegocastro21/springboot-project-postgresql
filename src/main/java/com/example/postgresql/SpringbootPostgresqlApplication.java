package com.example.postgresql;

import com.example.postgresql.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class SpringbootPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresqlApplication.class, args);
	}




}
