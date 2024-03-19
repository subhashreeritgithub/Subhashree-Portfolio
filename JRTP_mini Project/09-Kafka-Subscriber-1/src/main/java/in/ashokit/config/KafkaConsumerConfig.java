package in.ashokit.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;

import in.ashokit.binding.Order;
import in.ashokit.constants.AppConstants;

@Configuration
public class KafkaConsumerConfig {
	
@Bean
	public ConsumerFactory<String, Order> consumerFactory() {

		Map<String, Object> configProps = new HashMap<>();

		configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstants.HOST);
		configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);

		return new DefaultKafkaConsumerFactory<>(configProps);
}
@Bean
public ConcurrentKafkaListenerContainerFactory<String, Order> kafkaListnerFactory() {

	ConcurrentKafkaListenerContainerFactory<String, Order> factory = 
			new ConcurrentKafkaListenerContainerFactory<>();

	factory.setConsumerFactory(consumerFactory());

	return factory;
}
}
