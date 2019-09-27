package com.boa.kycprocess.configurations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.boa.kycprocess.models.MongoTransaction;
import com.boa.kycprocess.services.JDBCTransactionService;


public class JDBCTransactionImpl implements TransactionData{

	@Autowired
	private JDBCTransactionService jdbcService;
	@Override
	public List getAllTransactions() {
		// TODO Auto-generated method stub
		return this.jdbcService.gerAllTransactions();
	}
	@Override
	public MongoTransaction addTransaction(MongoTransaction md) {
		// TODO Auto-generated method stub
		return null;
	}

}
