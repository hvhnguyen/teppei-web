package com.teppei.kendo.teppei_kendo_shop.model.details;

import java.util.Objects;

public class ProductInfo {
	private String productCode;
	private String productName;
	private String description;
	private String images;
	
	public ProductInfo() {
	}

	public ProductInfo(String productCode, String productName, String description, String images) {
		this.productCode = productCode;
		this.productName = productName;
		this.description = description;
		this.images = images;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getProductCode());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ProductInfo)) {
			return false;
		}
		ProductInfo that = (ProductInfo) o;
		return getProductCode() == that.getProductCode();
	}
	
}
