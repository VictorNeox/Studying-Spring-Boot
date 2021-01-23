package com.crudrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudrestapi.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
