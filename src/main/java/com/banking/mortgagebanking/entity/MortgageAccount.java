package com.banking.mortgagebanking.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "mortgagesequence", initialValue = 100, allocationSize = 1)
public class MortgageAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mortgagesequence")
	private Long mortgageAccountNumber;
	private String password;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerPropertyId", nullable = false)
	private CustomerProperty customerPropertyId;

	private Double mortgageAccountBalance;
}
