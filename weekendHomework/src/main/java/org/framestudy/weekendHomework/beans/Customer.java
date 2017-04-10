package org.framestudy.weekendHomework.beans;

import java.io.Serializable;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2406371398131101310L;
	private String cus_Name;
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String cus_Name) {
		super();
		this.cus_Name = cus_Name;
	}


	public String getCus_Name() {
		return cus_Name;
	}


	public void setCus_Name(String cus_Name) {
		this.cus_Name = cus_Name;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cus_Name.toString();
	}
	
}
