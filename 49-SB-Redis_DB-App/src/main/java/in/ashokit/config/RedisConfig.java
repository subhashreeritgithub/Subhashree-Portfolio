package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration

public class RedisConfig {
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {

		RedisStandaloneConfiguration serverConfig = 
				new RedisStandaloneConfiguration("redis-14914.c267.us-east-1-4.ec2.cloud.redislabs.com", 14914);

		serverConfig.setUsername("default");
		serverConfig.setPassword("X7AES40hePcZQ2zidYR7A7jn44wV6t4B");

		JedisClientConfiguration clientConfig = JedisClientConfiguration.builder().build();

		return new JedisConnectionFactory(serverConfig, clientConfig);
	}
	
}
