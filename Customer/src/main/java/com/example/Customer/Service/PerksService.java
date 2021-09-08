package com.example.Customer.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Customer.Model.CustModel;
import com.example.Customer.Model.Transaction;
import com.example.Customer.repo.CustRepo;

@Service
public class PerksService {
	
	private static List<Transaction> transactions = new ArrayList<Transaction>();
	
	@Autowired
	CustRepo repo;
	private static long index;

	public List<CustModel> AllCustomers() {
		return repo.findAll();
	}

	public CustModel getCustomerById(Integer id) {
		return repo.findById(id).orElse(null);
	}
	


}
