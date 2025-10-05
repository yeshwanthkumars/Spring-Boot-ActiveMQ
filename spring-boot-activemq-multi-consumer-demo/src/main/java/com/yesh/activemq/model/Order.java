package com.yesh.activemq.model;

import java.io.Serializable;

public class Order implements Serializable {
	private String orderId;
	private String product;
	private int quantity;

	public Order() {
	}

	public Order(String orderId, String product, int quantity) {
		this.orderId = orderId;
		this.product = product;
		this.quantity = quantity;
	}

	// getters and setters
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order{" + "orderId='" + orderId + '\'' + ", product='" + product + '\'' + ", quantity=" + quantity
				+ '}';
	}
}
