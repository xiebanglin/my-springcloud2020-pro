package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {

        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_route_xie",
                r -> r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .build();
        return routes.build();
    }

    @Bean
    public RouteLocator customerRouteLocator1(RouteLocatorBuilder builder) {

        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_route_xie1",
                r -> r.path("/guoji").uri("http://news.baidu.com/guoji"))
                .build();
        return routes.build();
    }
}
