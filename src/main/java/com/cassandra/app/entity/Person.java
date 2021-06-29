package com.cassandra.app.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("person")
public class Person {
  @PrimaryKey
   private Integer sno;
  @Column
   private String name;
  @Column
   private String city;
   
   

public Person() {
	super();
}


public Person(Integer sno, String name, String city) {
	super();
	this.sno = sno;
	this.name = name;
	this.city = city;
}


public Integer getSno() {
	return sno;
}

public void setSno(Integer sno) {
	this.sno = sno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
   
   
}
