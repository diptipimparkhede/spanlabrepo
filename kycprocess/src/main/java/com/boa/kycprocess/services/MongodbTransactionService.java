package com.boa.kycprocess.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.kycprocess.models.MongoTransaction;
import com.boa.kycprocess.repositories.MongoTransactionRepository;


@Service
public class MongodbTransactionService {
	@Autowired
	private MongoTransactionRepository mongorepo;
	
	//add the Transaction
		public MongoTransaction addTransaction(MongoTransaction transaction)
		{
			return mongorepo.save(transaction);
		}
	
		//select all
		
		public List<MongoTransaction> gerAllTransactions()
		{
			return mongorepo.findAll();
		}
}
