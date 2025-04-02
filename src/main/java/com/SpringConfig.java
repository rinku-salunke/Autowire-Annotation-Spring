package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {


	@Bean
public Student s() {
	Student s=new Student();
	return s;
}

	
	
}
