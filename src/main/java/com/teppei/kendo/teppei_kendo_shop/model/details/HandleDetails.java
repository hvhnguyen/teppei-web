package com.teppei.kendo.teppei_kendo_shop.model.details;

import java.util.Objects;

public class HandleDetails {
	private String handleShape;
	private String handleSize;
	private String handleLength;
	
	public HandleDetails() {
	}

	public HandleDetails(String handleShape, String handleSize, String handleLength) {
		this.handleShape = handleShape;
		this.handleSize = handleSize;
		this.handleLength = handleLength;
	}

	public String getHandleShape() {
		return handleShape;
	}

	public void setHandleShape(String handleShape) {
		this.handleShape = handleShape;
	}

	public String getHandleSize() {
		return handleSize;
	}

	public void setHandleSize(String handleSize) {
		this.handleSize = handleSize;
	}

	public String getHandleLength() {
		return handleLength;
	}

	public void setHandleLength(String handleLength) {
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
