package com.brspd.enterprise.edata.rest.DTO;

import java.io.Serializable;

public class ProductCatalogDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long prdCtlgId;
	private String productName;
	private String category;
	private String asscUsoc;
	private String businessType;
	private String description;
	public Long getPrdCtlgId() {
		return prdCtlgId;
	}
	public void setPrdCtlgId(Long prdCtlgId) {
		this.prdCtlgId = prdCtlgId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAsscUsoc() {
		return asscUsoc;
	}
	public void setAsscUsoc(String asscUsoc) {
		this.asscUsoc = asscUsoc;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
