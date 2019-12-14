package com.banking.mortgagebanking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.mortgagebanking.repository.CustomerRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	CustomerRepository customerRepository;
}
