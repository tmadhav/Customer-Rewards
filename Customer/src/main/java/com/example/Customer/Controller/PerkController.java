package com.example.Customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer.Model.CustModel;
import com.example.Customer.Model.Transaction;
import com.example.Customer.Service.PerksService;

@RestController
public class PerkController {
		@Autowired
		private PerksService perks;
		
		@GetMapping("/customers")
		public List<CustModel> findAllCustomers(){
			return perks.AllCustomers();
		}
		
		@GetMapping("/customers/{id}")		
		public ResponseEntity<CustModel> geCustomer(@PathVariable Integer id){
			
			CustModel customer = perks.getCustomerById(id);
			if(customer == null ) 
			return new ResponseEntity<CustModel>(HttpStatus.NOT_FOUND);
				
			return new ResponseEntity<CustModel>(customer,HttpStatus.OK);
		}
		
}
