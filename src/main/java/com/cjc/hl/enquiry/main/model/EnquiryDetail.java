package com.cjc.hl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class EnquiryDetail {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
@NotEmpty
@Size(min=3,message = "Firstname must be min of  3 character !!! ")
	private String firstName;
@NotEmpty
@Size(min=3,message = "Firstname must be min of 3 character !!! ")
	private String middleName;
@NotEmpty
@Size(min=3,message = "Firstname must be min of 3 character !!! ")
	private String lastName;
@Min(18)
@Max(60)
	private int age;
@NotNull(message = "Address should not be null !!")	
	private String address;
@NotBlank
	private String country;
	private String existingCustomer;
@Email(message = "Email address is not valid !!")
	private String email;
@NotNull
//@Pattern(regexp = "^\\d{10}$",message = "Invalid Mobile number entered")
	private long mobileNo;
	private String preferredContactTime;
	private String preferredBranchCode;
@NotNull
@Pattern(regexp ="^\\d{12}$",message = "Invalid Adhar number entered" )
	private String adharNo;
@NotNull
	private String panCardNo;
	private String cibilScore;
	private String custType;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getExistingCustomer() {
		return existingCustomer;
	}
	public void setExistingCustomer(String existingCustomer) {
		this.existingCustomer = existingCustomer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPreferredContactTime() {
		return preferredContactTime;
	}
	public void setPreferredContactTime(String preferredContactTime) {
		this.preferredContactTime = preferredContactTime;
	}
	public String getPreferredBranchCode() {
		return preferredBranchCode;
	}
	public void setPreferredBranchCode(String preferredBranchCode) {
		this.preferredBranchCode = preferredBranchCode;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public String getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(String cibilScore) {
		this.cibilScore = cibilScore;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
}
