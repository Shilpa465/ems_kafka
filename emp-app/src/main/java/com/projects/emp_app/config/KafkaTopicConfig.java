package com.projects.emp_app.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author shilpashelton
 * 
 * This class is to create new topics
 *
 */
@Configuration
public class KafkaTopicConfig {
	
	/**
	 * @return New Topic with the name "emp-topic"
	 */
	@Bean
	public NewTopic emsTopic() {
		return TopicBuilder.name("emp-topic")
				.build();
	}


}
