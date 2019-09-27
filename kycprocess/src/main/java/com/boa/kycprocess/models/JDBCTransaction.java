package com.boa.kycprocess.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOA_Transaction")
public class JDBCTransaction {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TransactionId")
	private int transactionId;
	@Column(name="Amount")
	private long amount;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
}
