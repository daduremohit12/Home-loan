package com.cjc.hl.enquiry.main.service;

import org.springframework.http.ResponseEntity;

import com.cjc.hl.enquiry.main.model.EnquiryDetail;

public interface EnquiryDetailService {

	EnquiryDetail saveEnquiryDetail(EnquiryDetail e);

	Iterable<EnquiryDetail> fetchAllDetails();

	EnquiryDetail getById(int eId);

}
