package com.banking.mortgagebanking.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "customersequence", initialValue = 1000, allocationSize = 1)
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customersequence")
	private Long customerId;
	private String customerName;
	private Long accountNumber;
	private String accountType;
	private String accountBranchName;
	private LocalDate dateofBirth;
	private Double salary;
	private String gender;
	private Double accountBalance;

}
