package com.addistutor.SpringbootMockitotesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.addistutor.SpringbootMockitotesting.dao.UserRepository;
import com.addistutor.SpringbootMockitotesting.model.User;
import com.addistutor.SpringbootMockitotesting.service.UserService;


@SpringBootTest
class SpringBootMockitoTestingApplicationTests {

	@Autowired
	private UserService service;

	@MockBean
	private UserRepository repository;

	@Test
	public void getUsersTest() {
		when(repository.findAll()).thenReturn(Stream
				.of(new User( "Henno", 4, "USA"), new User( "Ezana", 3, "UK")).collect(Collectors.toList()));
		assertEquals(2, service.getUsers().size());
	}
	@Test
	public void addUserTest() {
		User user = new User( "Merry", 34, "Addis");
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.addUser(user));
	}
	@Test
	public void getUserbyAddressTest() {
		String address = "AA";
		when(repository.findByAddress(address))
				.thenReturn(Stream.of(new User( "Henno", 4, "USA")).collect(Collectors.toList()));
		assertEquals(1, service.getUserbyAddress(address).size());
	}

}
