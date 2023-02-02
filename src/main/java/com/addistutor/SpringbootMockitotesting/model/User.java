package com.addistutor.SpringbootMockitotesting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "usersTable")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	@Id
	private int id;
	private String name;
	private int age;
	private String address;

}
