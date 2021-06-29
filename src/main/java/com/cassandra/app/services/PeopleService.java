package com.cassandra.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cassandra.app.entity.Person;
import com.cassandra.app.repos.PersonRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PeopleService {
	@Autowired
	PersonRepository repo;
	
	public Flux<Person> getPerson(){
	  return repo.findAll(); 
    }
	
	public Mono<Person> save(Person p){
		System.out.println(p+" is the p you know");
		System.out.println(p.getSno()+ " "+p.getName()+ " "+p.getCity());
		return repo.save(p);
	}
}
