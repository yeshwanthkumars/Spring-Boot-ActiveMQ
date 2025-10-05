package com.yesh.activemq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import jakarta.jms.ConnectionFactory;

@Configuration
public class JmsConfig {
	
	
	@Bean
    public MappingJackson2MessageConverter jacksonJmsMessageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }
	
	@Bean
	public DefaultJmsListenerContainerFactory topicListenerFactory(ConnectionFactory connectionFactory,
	                                                              MappingJackson2MessageConverter converter) {
	    DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
	    factory.setConnectionFactory(connectionFactory);
	    factory.setMessageConverter(converter);
	    factory.setPubSubDomain(true); // For Topic
	    return factory;
	}

}
