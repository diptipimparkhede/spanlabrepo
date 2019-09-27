package com.boa.kycprocess.configurations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.boa.kycprocess.services.MongodbTransactionService;


public class MongoTransactionImpl implements TransactionData{

	@Autowired
	private MongodbTransactionService mongoService;
	@Override
	public List getAllTransactions() {
		// TODO Auto-generated method stub
		return this.mongoService.gerAllTransactions();
	}

}
