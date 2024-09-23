package com.BuilderDesignPattern.BuilderDesignPattern;

import com.BuilderDesignPattern.URLBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderDesignPatternApplication {

	public static void main(String[] args) {

		URLBuilder.Builder builder= new URLBuilder.Builder();
		builder.protocol("mj").port("4303");
		URLBuilder urlBuilder=builder.build();
		System.out.println(urlBuilder.port);

	}

}
