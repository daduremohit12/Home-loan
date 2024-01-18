package com.cjc.hl.enquiry.main.service;

import com.cjc.hl.enquiry.main.model.CibilSCore;

public interface CibilService {

	CibilSCore saveCibdata(CibilSCore cs);

	Iterable<CibilSCore> getAlldata();

}
