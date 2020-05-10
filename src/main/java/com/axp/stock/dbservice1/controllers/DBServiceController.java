package com.axp.stock.dbservice1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.axp.stock.dbservice1.model.Quote;
import com.axp.stock.dbservice1.repos.QuotesRepository;

@CrossOrigin
@RestController
@RequestMapping("/rest/dbservice/stock")
public class DBServiceController {
	QuotesRepository quotesRepository;

	public QuotesRepository getQuotesRepository() {
		return quotesRepository;
	}

	@Autowired
	public void setQuotesRepository(QuotesRepository quotesRepository) {
		this.quotesRepository = quotesRepository;
	}
	
	@GetMapping("/doctors")
	public @ResponseBody Iterable<Quote> getAllDoctors() {
	    return quotesRepository.findAll();
	  }
}
