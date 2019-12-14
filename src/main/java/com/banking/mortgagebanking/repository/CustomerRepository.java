package com.banking.mortgagebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.mortgagebanking.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
