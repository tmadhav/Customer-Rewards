package com.example.Customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Customer.Model.CustModel;

@Repository
public interface CustRepo extends JpaRepository<CustModel, Integer> {
		

}
