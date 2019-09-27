package com.boa.kycprocess.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boa.kycprocess.configurations.TransactionData;
import com.boa.kycprocess.models.MongoTransaction;


@Controller
public class TransactionController {
	@Autowired
	private TransactionData service;
	@RequestMapping("/transaction")
	public String loadHome(Model model)
	{
		model.addAttribute("transactionList", service.getAllTransactions());
		return "home";
	}
	@RequestMapping(value="/addtransaction", method=RequestMethod.POST)
	public String createTransactionData(@ModelAttribute MongoTransaction tran)
	{
		this.service.addTransaction(tran);
		  return "redirect:transaction";
	}

}
