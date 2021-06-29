package com.cassandra.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.cassandra.app.entity.Person;
import com.cassandra.app.services.PeopleService;

import reactor.core.publisher.Mono;

@Component
public class RequestHandler {
	  @Autowired
	  PeopleService pservice;
	  
	  public Mono<ServerResponse> getAllPeople(ServerRequest serverRequest) {
	      return ServerResponse.ok().body(pservice.getPerson(),Person.class);
	  }
	  
	  public Mono<ServerResponse> savePerson(ServerRequest serverRequest)
	  {
	      Mono<Person> personsaved=serverRequest.bodyToMono(Person.class);
	      
	      return personsaved.flatMap( person ->{
	    	  
	    
	              return ServerResponse.status(HttpStatus.CREATED).body(pservice.save(person), Person.class);});
	  }
}

