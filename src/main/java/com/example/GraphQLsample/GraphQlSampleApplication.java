package com.example.GraphQLsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.GraphQLsample.query, com.example.GraphQLsample.service",
				"com.example.GraphQLsample.mutation"})
@EntityScan("com.example.GraphQLsample.model")
@EnableJpaRepositories("com.example.GraphQLsample.repository")
public class GraphQlSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlSampleApplication.class, args);
	}

}
