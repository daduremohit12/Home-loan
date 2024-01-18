package com.cjc.hl.enquiry.main.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.hl.enquiry.main.Exception.DocumentNotFoundException;
import com.cjc.hl.enquiry.main.model.PropertyDocument;
import com.cjc.hl.enquiry.main.repository.DocumentGetByCidRepository;
import com.cjc.hl.enquiry.main.repository.PropertyDocumentRepository;
import com.cjc.hl.enquiry.main.service.PropDocumentService;
@Service
public class PropDocumentServiceImpl implements PropDocumentService{

	@Autowired
	private PropertyDocumentRepository repository;
	@Autowired
	private DocumentGetByCidRepository cidrepository;

	@Override
	public PropertyDocument saveDoc(PropertyDocument pa) {
		PropertyDocument propertyDocument = repository.save(pa);
		return propertyDocument;
	}

	@Override
	public Iterable<PropertyDocument> fetchAllDocument() {
		Iterable<PropertyDocument> findAll = repository.findAll();
		return findAll;
	}

	@Override
	public PropertyDocument fetchDocumentById(int propDocId) {
		Optional<PropertyDocument> optional = repository.findById(propDocId);
		return optional.get();
	}

	@Override
	public PropertyDocument fetchDocumentByCid(int cusId) {
		PropertyDocument document = cidrepository.findByCusId(cusId);
		return document;
    

	}
}
