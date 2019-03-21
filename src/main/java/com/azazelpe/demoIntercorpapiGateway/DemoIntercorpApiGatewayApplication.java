package com.azazelpe.demoIntercorpapiGateway;

import com.azazelpe.demoIntercorpapiGateway.filter.SecurityFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class DemoIntercorpApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIntercorpApiGatewayApplication.class, args);
	}

	@Bean
	public SecurityFilter securityFilter() {
		return new SecurityFilter();
	}

}
