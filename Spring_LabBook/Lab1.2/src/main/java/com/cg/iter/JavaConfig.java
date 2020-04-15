package com.cg.iter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



@Configuration
@ComponentScan("com.cg.iter")
@PropertySource("classpath:employee.properties")

public class JavaConfig {

	
}
