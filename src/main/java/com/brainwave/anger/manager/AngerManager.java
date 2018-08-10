/**
 * 
 */
package com.brainwave.anger.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

/**
 * @author kutesneh
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class AngerManager {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AngerManager.class, args);
	}
}
