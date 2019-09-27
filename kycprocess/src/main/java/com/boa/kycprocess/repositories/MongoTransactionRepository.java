package com.boa.kycprocess.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.boa.kycprocess.models.MongoTransaction;

@Transactional
public interface MongoTransactionRepository extends MongoRepository<MongoTransaction,Integer>{

}
