package com.addistutor.SpringbootMockitotesting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "usersTable")
@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class User {
	 
	
	@Id
	private String id;
	private String name;
	private int age;
	private String address;
	
	
	public User() {
		super();
	}
	public User(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
