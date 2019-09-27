package com.boa.kycprocess.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.kycprocess.models.JDBCTransaction;
import com.boa.kycprocess.repositories.JDBCTransactionRepository;


@Service
public class JDBCTransactionService {

	@Autowired
	private JDBCTransactionRepository jdbcrepo;
	
	//add the Transaction
		public JDBCTransaction addTransaction(JDBCTransaction transaction)
		{
			return jdbcrepo.save(transaction);
		}
	
		//select all
		
		public List<JDBCTransaction> gerAllTransactions()
		{
			return jdbcrepo.findAll();
		}
}
