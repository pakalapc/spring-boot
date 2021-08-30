package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableTransactionManagement
//@PropertySource(value = "classpath:api-mfa.properties")
//@PropertySource(value = "file:${MICROSERVICES_CONFIG}/api-mfa.properties", ignoreResourceNotFound = true)
//@PropertySource(value = "classpath:environment.properties")
@PropertySource(value = "file:${MICROSERVICES_CONFIG}/environment.properties", ignoreResourceNotFound = true)
@ComponentScan(basePackages = "com.example")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
