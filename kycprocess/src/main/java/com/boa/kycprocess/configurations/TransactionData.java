package com.boa.kycprocess.configurations;

import java.util.List;

import com.boa.kycprocess.models.MongoTransaction;

public interface TransactionData {

	MongoTransaction addTransaction(MongoTransaction md);
	List getAllTransactions();
}
