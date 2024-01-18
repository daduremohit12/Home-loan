package com.cjc.hl.enquiry.main.serviceImpl;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.hl.enquiry.main.model.CibilSCore;
import com.cjc.hl.enquiry.main.repository.CibilRepository;
import com.cjc.hl.enquiry.main.service.CibilService;
@Service
public class CibilServiceImpl implements CibilService {

	@Autowired
	private CibilRepository cibRepository;
	@Override
	public CibilSCore saveCibdata(CibilSCore cs) {
		
		Random random=new Random();
		cs.setCibilscore(random.nextInt(750-650)+650);
		
		CibilSCore cibilSCore = cibRepository.save(cs);
		return cibilSCore;
	}
	@Override
	public Iterable<CibilSCore> getAlldata() {
		Iterable<CibilSCore> findAll = cibRepository.findAll();
		
		return findAll;
	}

}
