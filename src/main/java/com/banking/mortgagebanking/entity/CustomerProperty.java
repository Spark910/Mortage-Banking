package com.banking.mortgagebanking.entity;

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
public class CustomerProperty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerPropertyId;
	private String propertyLocation;
	private String propertyType;
	private Double propertyValue;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerId", nullable = false)
	private Customer customerId;
}
