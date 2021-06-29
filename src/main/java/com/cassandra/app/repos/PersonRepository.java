
package com.cassandra.app.repos;



import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import com.cassandra.app.entity.Person;

public interface PersonRepository extends ReactiveCassandraRepository<Person, Long>{

}
