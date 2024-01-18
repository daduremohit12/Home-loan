package com.cjc.hl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CibilSCore {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int cibId;
private String date;
private int cibilscore;
private String pancardNo;
public int getCibId() {
	return cibId;
}
public void setCibId(int cibId) {
	this.cibId = cibId;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getCibilscore() {
	return cibilscore;
}
public void setCibilscore(int cibilscore) {
	this.cibilscore = cibilscore;
}
public String getPancardNo() {
	return pancardNo;
}
public void setPancardNo(String pancardNo) {
	this.pancardNo = pancardNo;
}
}
