package org.framestudy.weekendHomework.dao.impl;

import org.framestudy.weekendHomework.beans.Customer;
import org.framestudy.weekendHomework.beans.Order;
import org.framestudy.weekendHomework.dao.TestDao;

public class TestDaoImpl implements TestDao{

	public void trade(Customer customer, Order order) {
		// TODO Auto-generated method stub
		System.out.println(customer.getCus_Name()+"œ¬¡À∂©µ•:"+order.getOrderName());
	}
}
