package com.cjc.hl.enquiry.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.hl.enquiry.main.Exception.DetailsNotFoundException;
import com.cjc.hl.enquiry.main.model.EnquiryDetail;
import com.cjc.hl.enquiry.main.repository.EnquiryDetailRepository;
import com.cjc.hl.enquiry.main.service.EnquiryDetailService;
@Service
public class EnquiryDetailServiceImpl implements EnquiryDetailService{

	@Autowired
	private EnquiryDetailRepository enqRepository;
	@Override
	public EnquiryDetail saveEnquiryDetail(EnquiryDetail e) {
		EnquiryDetail enquiryDetail = enqRepository.save(e);
		return enquiryDetail;
	}
	@Override
	public Iterable<EnquiryDetail> fetchAllDetails() {
		Iterable<EnquiryDetail> findAll = enqRepository.findAll();
		return findAll;
	}
	@Override
	public EnquiryDetail getById(int eId) {
		Optional<EnquiryDetail> optional = enqRepository.findById(eId);
		if(optional.isPresent()) {
			EnquiryDetail enquiryDetail = optional.get();
			return enquiryDetail;
		}
		throw new DetailsNotFoundException("Details Not Found"+eId);
	}

}
