package in.ashokit;

import java.lang.System.Logger;
import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import com.google.common.net.HttpHeaders;

import reactor.core.publisher.Mono;
@Component
public class AppFilter implements GlobalFilter {

	

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

		// Accessing HTTP Request information
		org.springframework.http.server.reactive.ServerHttpRequest request = exchange.getRequest();

		org.springframework.http.HttpHeaders headers = request.getHeaders();
		Set<String> keySet = headers.keySet();
		
		keySet.forEach(key -> {
			List<String> values = headers.get(key);
			System.out.println(key +" :: "+values);
		});

		return chain.filter(exchange);
	}
}
