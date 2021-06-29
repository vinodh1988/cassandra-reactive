package com.cassandra.app.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
@Configuration
public class ApiRoutes {
  
	   @Bean
	    public RouterFunction<ServerResponse> routes(RequestHandler personHandler) {
	    	
	        return nest(path("/people"),
	                nest(
	                		accept(MediaType.APPLICATION_JSON),
	                        route(GET("/"),personHandler::getAllPeople )
	                        .andRoute(POST("/"), personHandler::savePerson))
	                );
	    }
}
