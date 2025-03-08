package com.teppei.kendo.teppei_kendo_shop.model;

import com.teppei.kendo.teppei_kendo_shop.model.details.HandleDetails;
import com.teppei.kendo.teppei_kendo_shop.model.details.ProductInfo;
import com.teppei.kendo.teppei_kendo_shop.model.details.Specification;

public class Shinai extends Product {
	private ProductInfo productInfo;
	private Specification specification;
	private HandleDetails handleDetails;
	private String bellyShape;
	private boolean isComplete;
	private boolean isSSP;
	
	public Shinai() {
	}

	public Shinai(ProductInfo productInfo, Specification specification, HandleDetails handleDetails, 
				  String bellyShape, boolean isComplete, boolean isSSP) {
		this.productInfo = productInfo;
		this.specification = specification;
		this.handleDetails = handleDetails;
		this.bellyShape = bellyShape;
		this.isComplete = isComplete;
		this.isSSP = isSSP;
	}

	public ProductInfo getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	public Specification getSpecification() {
		return specification;
	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	public HandleDetails getHandleDetails() {
		return handleDetails;
	}

	public void setHandleDetails(HandleDetails handleDetails) {
		this.handleDetails = handleDetails;
	}

	public String getBellyShape() {
		return bellyShape;
	}

	public void setBellyShape(String bellyShape) {
		this.bellyShape = bellyShape;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public boolean isSSP() {
		return isSSP;
	}

	public void setSSP(boolean isSSP) {
		this.isSSP = isSSP;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((productInfo == null || productInfo.getProductCode() == null) 
						? 0 : productInfo.getProductCode().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Shinai)) {
			return false;
		}
		Shinai that = (Shinai) o;
		return productInfo.getProductCode() == that.productInfo.getProductCode();
	}
	
}
