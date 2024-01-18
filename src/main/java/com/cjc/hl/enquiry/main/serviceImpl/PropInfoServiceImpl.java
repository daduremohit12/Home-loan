package com.cjc.hl.enquiry.main.serviceImpl;

import com.cjc.hl.enquiry.main.model.PropertyAddress;
import com.cjc.hl.enquiry.main.model.PropertyDocument;
import com.cjc.hl.enquiry.main.model.PropertyInfo;
import com.cjc.hl.enquiry.main.repository.PropertyAddressRepository;
import com.cjc.hl.enquiry.main.repository.PropertyInfoRepository;
import com.cjc.hl.enquiry.main.service.PropertyInfoService;
import com.cjc.hl.enquiry.main.repository.PropertyDocumentRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropInfoServiceImpl implements PropertyInfoService{

	
	@Autowired
	private PropertyAddressRepository parepo;
	@Autowired
	private PropertyInfoRepository pirepository;
	@Override
	public PropertyInfo saveData(PropertyInfo p) {
		PropertyInfo propertyInfo = pirepository.save(p);
		
		return propertyInfo;
	}
//	@Override
//	public PropertyDocument saveDoc(PropertyDocument pa) {
//		PropertyDocument propertyDocument = repository.save(pa);
//		return propertyDocument;
//	}
	@Override
	public PropertyAddress saveAdd(PropertyAddress paa) {
		PropertyAddress propertyAddress = parepo.save(paa);
		return propertyAddress;
	}
	@Override
	public Iterable<PropertyInfo> fetchAllData() {
		Iterable<PropertyInfo> findAll = pirepository.findAll();
		
		return findAll;
	}
	@Override
	public PropertyInfo getPropInfoById(int propertyId) {
		Optional<PropertyInfo> optional = pirepository.findById(propertyId);
		return optional.get();
	}
	@Override
	public Iterable<PropertyAddress> fetchAlladdressdata() {
		Iterable<PropertyAddress> findAll = parepo.findAll();
		
		return findAll;
	}
	@Override
	public PropertyAddress getPropAddressById(int propertyAddressId) {
		Optional<PropertyAddress> optional = parepo.findById(propertyAddressId);
		return optional.get();
	}

}
