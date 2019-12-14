package com.banking.mortgagebanking.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;
	private LocalDate transactionDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="mortgageAccountNumber",nullable=false)
	private MortgageAccount mortgageAccountNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="savingsAccountNumber",nullable=false)
	private Customer savingsAccountNumber;
}
