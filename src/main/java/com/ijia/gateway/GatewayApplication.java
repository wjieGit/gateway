package com.ijia.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
  /* @Bean
   public RouteLocator myRoutes(RouteLocatorBuilder builder) {
       return builder.routes()
               .route(p -> p
                       .path("/get")
                       .filters(f -> f.addRequestHeader("Hello", "World"))
                       .uri("http://httpbin.org:80"))
               .route(p -> p
                       .host("*.hystrix.com")
                       .filters(f -> f.hystrix(config -> config.setName("mycmd")))
                       .uri("http://httpbin.org:80"))
               .build();
   }*/

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to Gateway";
    }
}
