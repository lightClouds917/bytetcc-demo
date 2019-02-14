package com.java4all;

import org.bytesoft.bytetcc.supports.springcloud.config.SpringCloudSecondaryConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@EnableFeignClients("com.java4all.feign")
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.java4all")
@MapperScan("com.java4all.dao")
@Import(SpringCloudSecondaryConfiguration.class)
@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class})
public class BankServerApplication{

	public static void main(String[] args) {
		SpringApplication.run(BankServerApplication.class, args);
	}

}

