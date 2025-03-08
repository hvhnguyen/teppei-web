package com.teppei.kendo.teppei_kendo_shop.model.details;

import java.util.Objects;

public class Specification {
	private String type;
	private String feature;
	private String material;
	
	public Specification() {
	}

	public Specification(String size, String type, String feature, String material) {
		this.type = type;
		this.feature = feature;
		this.material = material;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public int hashCode() {
		return Objects.hash(feature, material, type);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Specification)) {
			return false;
		}
		Specification that = (Specification) o;
		return Objects.equals(feature, that.feature) && Objects.equals(material, that.material)
				 && Objects.equals(type, that.type);
	}
	
}
