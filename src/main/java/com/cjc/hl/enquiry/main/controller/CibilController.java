package com.cjc.hl.enquiry.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.enquiry.main.model.CibilSCore;
import com.cjc.hl.enquiry.main.service.CibilService;

@RestController
public class CibilController {

	@Autowired
	private CibilService cibservice;
	@PostMapping("/saveCibil")
	public CibilSCore saveData(@RequestBody CibilSCore cs) {
		CibilSCore saveCibdata = cibservice.saveCibdata(cs);
		return saveCibdata;
	}
	@GetMapping("/CibilScores")
	public Iterable<CibilSCore> getAllData(){
		Iterable<CibilSCore> alldata = cibservice.getAlldata();
		return alldata;
		
	}
}
