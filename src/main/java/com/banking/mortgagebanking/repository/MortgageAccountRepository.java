package com.banking.mortgagebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.mortgagebanking.entity.MortgageAccount;

@Repository
public interface MortgageAccountRepository extends JpaRepository<MortgageAccount, Long> {

}
