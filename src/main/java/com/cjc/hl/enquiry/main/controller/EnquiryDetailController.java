package com.cjc.hl.enquiry.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.hl.enquiry.main.model.EnquiryDetail;
import com.cjc.hl.enquiry.main.service.EnquiryDetailService;

@RestController
@RequestMapping("/users")
public class EnquiryDetailController {

	@Autowired
	
	private EnquiryDetailService enqService;
	
	@PostMapping("/saveEnquiryDetail")
	public ResponseEntity<EnquiryDetail> saveEnquiryDetail(@Valid @RequestBody EnquiryDetail e)
	{
//		EnquiryDetail saveEnquiryDetail = enqService.saveEnquiryDetail(e);
//		if(saveEnquiryDetail.geteId()>0) {
//			return saveEnquiryDetail.getFirstName()+" Is successfully saved";
//		}
		return new ResponseEntity<>(enqService.saveEnquiryDetail(e),HttpStatus.CREATED);
	}
	
	@GetMapping("/enquiryDetails")
	public ResponseEntity<Iterable<EnquiryDetail>> getAllEnquiryDetail(){
//		Iterable<EnquiryDetail> fetchAllDetails = enqService.fetchAllDetails();
//		return fetchAllDetails;
		return ResponseEntity.ok(enqService.fetchAllDetails());
	}
	
	@GetMapping("/enquirydetail/{eId}")
	public ResponseEntity<EnquiryDetail> getDataById(@PathVariable int eId) {
//		EnquiryDetail enquiryDetail = enqService.getById(eId);
//		return enquiryDetail;
		return ResponseEntity.ok(enqService.getById(eId));
	}
}
