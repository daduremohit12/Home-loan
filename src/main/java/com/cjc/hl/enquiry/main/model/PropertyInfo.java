package com.cjc.hl.enquiry.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PropertyInfo {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int propertyId;
	private String propertyType;
	private String propertyArea;
	private String constructorArea;
	private double propertyPrice;
	private double constructionPrice;
//	@Lob
//	private byte[] propertyPriceProof;
//	
	
//	private PropertyDocument propDocument;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyAddress propAddress;
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getPropertyArea() {
		return propertyArea;
	}
	public void setPropertyArea(String propertyArea) {
		this.propertyArea = propertyArea;
	}
	public String getConstructorArea() {
		return constructorArea;
	}
	public void setConstructorArea(String constructorArea) {
		this.constructorArea = constructorArea;
	}
	public double getPropertyPrice() {
		return propertyPrice;
	}
	public void setPropertyPrice(double propertyPrice) {
		this.propertyPrice = propertyPrice;
	}
	public double getConstructionPrice() {
		return constructionPrice;
	}
	public void setConstructionPrice(double constructionPrice) {
		this.constructionPrice = constructionPrice;
	}
//	public byte[] getPropertyPriceProof() {
//		return propertyPriceProof;
//	}
//	public void setPropertyPriceProof(byte[] propertyPriceProof) {
//		this.propertyPriceProof = propertyPriceProof;
//	}
//	public PropertyDocument getPropDocument() {
//		return propDocument;
//	}
//	public void setPropDocument(PropertyDocument propDocument) {
//		this.propDocument = propDocument;
//	}
	public PropertyAddress getPropAddress() {
		return propAddress;
	}
	public void setPropAddress(PropertyAddress propAddress) {
		this.propAddress = propAddress;
	}
	
}
