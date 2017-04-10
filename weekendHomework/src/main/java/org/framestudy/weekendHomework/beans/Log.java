package org.framestudy.weekendHomework.beans;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable{
	private Date date;
	private Customer customer;
	private Order order;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return date.toString();
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Log(Date date, Customer customer, Order order) {
		super();
		this.date = date;
		this.customer = customer;
		this.order = order;
	}
	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
