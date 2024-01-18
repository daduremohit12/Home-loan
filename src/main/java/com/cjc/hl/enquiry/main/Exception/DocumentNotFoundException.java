package com.cjc.hl.enquiry.main.Exception;

public class DocumentNotFoundException  extends RuntimeException{

	public DocumentNotFoundException() {}
	public DocumentNotFoundException(String msg) {
		super(msg);
	}
}
