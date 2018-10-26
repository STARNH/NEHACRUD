package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages ="com")
@EnableJpaRepositories("com")
@EntityScan("com")
public class Test 
{
	public static void main(String[] args)
	{
		System.out.println("1111111111111111111111111111111111111111");
		SpringApplication.run(Test.class,args);
		System.out.println("222222222222222222222222222222222222222222222");
	}

}
