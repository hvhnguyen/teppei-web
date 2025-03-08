package com.teppei.kendo.teppei_kendo_shop.model.details;

import java.util.Objects;

import com.teppei.kendo.teppei_kendo_shop.enums.Feature;
import com.teppei.kendo.teppei_kendo_shop.enums.Meterial;
import com.teppei.kendo.teppei_kendo_shop.enums.Type;

public class Specification {
	private Type type;
	private Feature feature;
	private Meterial material;
	
	public Specification() {
	}
	

	public Specification(Type type, Feature feature, Meterial material) {
		this.type = type;
		this.feature = feature;
		this.material = material;
	}

	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public Feature getFeature() {
		return feature;
	}


	public void setFeature(Feature feature) {
		this.feature = feature;
	}


	public Meterial getMaterial() {
		return material;
	}


	public void setMaterial(Meterial material) {
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
