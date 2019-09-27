package com.boa.kycprocess.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.kycprocess.models.JDBCTransaction;


public interface JDBCTransactionRepository extends JpaRepository<JDBCTransaction,Integer>{

}
