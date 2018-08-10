/**
 * 
 */
package com.brainwave.anger.manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kutesneh
 *
 */
@Configuration
public class RegistrationConfig {
	
	private static Long latestUniqueId=0L;
	
	@Bean
	public Long uniqueId() {
		return latestUniqueId+1;
	}

}
