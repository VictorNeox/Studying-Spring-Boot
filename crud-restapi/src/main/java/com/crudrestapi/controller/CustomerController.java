package com.crudrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudrestapi.repository.CustomerRepository;
import com.crudrestapi.model.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping
	public List<Customer> loadAll() {
		return customerRepository.findAll();
	}
	
	@PostMapping
	public Customer save(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
}
