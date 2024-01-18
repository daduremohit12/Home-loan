package com.cjc.hl.enquiry.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.cjc.hl.enquiry.main.model.PropertyAddress;
import com.cjc.hl.enquiry.main.model.PropertyInfo;
import com.cjc.hl.enquiry.main.service.PropertyInfoService;

@CrossOrigin("*")
@RestController
public class PropInfoController {

	@Autowired
	private PropertyInfoService service;
	@PostMapping(value = "/saveAll")
	public PropertyInfo saveData(@RequestBody PropertyInfo p) {
		
		PropertyInfo propertyInfo = service.saveData(p);
		return propertyInfo;
	
    }
	
	@PostMapping(value = "/saveAddress")
	public PropertyAddress saveAdd(@RequestBody PropertyAddress paa) {
		PropertyAddress propertyAddress = service.saveAdd(paa);
		return propertyAddress;
	}
	@GetMapping(value = "/getAllData")
	public Iterable<PropertyInfo> getAllpropinfo(){
		    
		Iterable<PropertyInfo> fetchAllData = service.fetchAllData();
		return fetchAllData;
	}
	@GetMapping("/propInfo/{propertyId}")
	public PropertyInfo getPropInfoById(@PathVariable int propertyId) {
		PropertyInfo propInfoById = service.getPropInfoById(propertyId);
		return propInfoById;
	}
	@GetMapping("/PropAddress")
	public Iterable<PropertyAddress> getAllPropAddress(){
		  Iterable<PropertyAddress> fetchAlladdressdata = service.fetchAlladdressdata();
		  return fetchAlladdressdata;
	}
	
	@GetMapping("/PropAdress/{propertyAddressId}")
	public PropertyAddress getById(@PathVariable int propertyAddressId) {
		PropertyAddress propAddressById = service.getPropAddressById(propertyAddressId);
		return propAddressById;
	}
}