package com.cjc.hl.enquiry.main.ExceptionHandler;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cjc.hl.enquiry.main.Exception.DetailsNotFoundException;




@RestControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(value = DetailsNotFoundException.class)
	@ResponseStatus(value = HttpStatus.FOUND)
	public String DetailsNotFoundExceptionHandler() {
		return "Details Not Found";
	}
@ResponseStatus(HttpStatus.BAD_REQUEST)
@ExceptionHandler(MethodArgumentNotValidException.class)
public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex){
	Map<String, String> errorMap=new HashMap<>();
	ex.getBindingResult().getFieldErrors().forEach(error->{
		errorMap.put(error.getField(), error.getDefaultMessage());
	});
	return errorMap;
}
//@ResponseStatus(HttpStatus.BAD_REQUEST)
//@ExceptionHandler(UnexpectedTypeException.class)
//public Map<String, String> handleUnexpectedTypeException(UnexpectedTypeException ute){
//	Map<String, String> errorMap=new HashMap<>();
//	ute.
//}

@ResponseStatus(HttpStatus.BAD_REQUEST)
@ExceptionHandler(value =com.cjc.hl.enquiry.main.Exception.DocumentNotFoundException.class )

public String DocumentNotFoundException() {
	return "Details Not Found";
	
}
}
