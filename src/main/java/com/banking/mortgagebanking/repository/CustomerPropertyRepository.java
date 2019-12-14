package com.banking.mortgagebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.mortgagebanking.entity.CustomerProperty;

@Repository
public interface CustomerPropertyRepository extends JpaRepository<CustomerProperty, Long> {

}
