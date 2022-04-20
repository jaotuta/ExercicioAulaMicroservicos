package com.letscode.escolaaluno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EscolaAlunoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EscolaAlunoApplication.class, args);
	}

}
