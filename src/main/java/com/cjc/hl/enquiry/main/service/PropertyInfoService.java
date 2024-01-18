package com.cjc.hl.enquiry.main.service;



import com.cjc.hl.enquiry.main.model.PropertyAddress;
import com.cjc.hl.enquiry.main.model.PropertyDocument;
import com.cjc.hl.enquiry.main.model.PropertyInfo;

public interface PropertyInfoService {

	Iterable<PropertyAddress> fetchAlladdressdata();

	PropertyInfo saveData(PropertyInfo p);

//	PropertyDocument saveDoc(PropertyDocument pa);

	PropertyAddress saveAdd(PropertyAddress paa);

	Iterable<PropertyInfo> fetchAllData();

	PropertyInfo getPropInfoById(int propertyId);

	PropertyAddress getPropAddressById(int propertyAddressId);
  
	
	}


