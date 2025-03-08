package com.teppei.kendo.teppei_kendo_shop.model.details;

import java.util.Objects;

import com.teppei.kendo.teppei_kendo_shop.enums.HandleLength;
import com.teppei.kendo.teppei_kendo_shop.enums.HandleShape;
import com.teppei.kendo.teppei_kendo_shop.enums.HandleSize;

public class HandleDetails {
	private HandleShape handleShape;
	private HandleSize handleSize;
	private HandleLength handleLength;
	
	public HandleDetails() {
	}
	
	public HandleDetails(HandleShape handleShape, HandleSize handleSize, HandleLength handleLength) {
		this.handleShape = handleShape;
		this.handleSize = handleSize;
		this.handleLength = handleLength;
	}
	
	public HandleShape getHandleShape() {
		return handleShape;
	}

	public void setHandleShape(HandleShape handleShape) {
		this.handleShape = handleShape;
	}

	public HandleSize getHandleSize() {
		return handleSize;
	}

	public void setHandleSize(HandleSize handleSize) {
		this.handleSize = handleSize;
	}

	public HandleLength getHandleLength() {
		return handleLength;
	}

	public void setHandleLength(HandleLength handleLength) {
		this.handleLength = handleLength;
	}

	@Override
	public int hashCode() {
		return Objects.hash(handleLength, handleShape, handleSize);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof HandleDetails)) {
			return false;
		}
		HandleDetails that = (HandleDetails) o;
		return Objects.equals(handleLength, that.handleLength) && Objects.equals(handleShape, that.handleShape)
				&& Objects.equals(handleSize, that.handleSize);
	}
	
}
