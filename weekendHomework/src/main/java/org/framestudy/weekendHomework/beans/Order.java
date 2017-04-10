package org.framestudy.weekendHomework.beans;

import java.io.Serializable;

public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8877167582373646646L;
	private String orderName;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return orderName.toString();
	}

	public Order(String orderName) {
		super();
		this.orderName = orderName;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
}
