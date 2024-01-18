package com.cjc.hl.enquiry.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cjc.hl.enquiry.main.model.PropertyDocument;
@Repository
public interface DocumentGetByCidRepository extends JpaRepository<PropertyDocument, Integer>{

	PropertyDocument findByCusId(int cusId);

	
  
}
