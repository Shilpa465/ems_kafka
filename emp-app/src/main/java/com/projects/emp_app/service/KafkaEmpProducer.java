package com.projects.emp_app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.projects.ems_kafka.dto.EmployeeDTO;

/**
 * @author shilpashelton
 *
 */
@Service
public class KafkaEmpProducer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaEmpProducer.class);
	
	private KafkaTemplate<String, EmployeeDTO> kafkaTemplate;
	
	/**
	 * @param kafkaTemplate
	 */
	public KafkaEmpProducer(KafkaTemplate<String, EmployeeDTO> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	/**
	 * @param data
	 */
	public void sendMessage(EmployeeDTO data) {
		
		LOGGER.info(String.format("Message sent %s", data.toString()));
		
		Message<EmployeeDTO> message = MessageBuilder
				.withPayload(data)
				.setHeader(KafkaHeaders.TOPIC, "emp-topic")
				.build();
		
		kafkaTemplate.send(message);
		
	}

}
