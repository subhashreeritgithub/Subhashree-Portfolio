package in.ashokit.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.fasterxml.jackson.databind.ser.std.StringSerializer;

import in.ashokit.binding.Order;
import in.ashokit.constants.AppConstants;

@Configuration
public class KafkaProducerConfig {
	@Bean
 public ProducerFactory<String, Order>producerFactory(){
	 Map <String, Object> configProps = new HashMap<>();
	 //where the kafka server is present 
	 configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,AppConstants.HOST);
	 //in here store the key type   in string format
	 configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,StringSerializer.class);
	 //here the value ,order data will store
	 configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,JsonSerializer.class);
	 return  new DefaultKafkaProducerFactory<>(configProps);
	 
 }
 @Bean
 //here passing the producerfactory object as input  kafkatemplte
	public KafkaTemplate<String, Order> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory());
	}
}