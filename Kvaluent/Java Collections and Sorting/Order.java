package com.assignmentk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private Long id;
	private LocalDate orderdate;
	private LocalDate deliverydate;
	private String status;
	private Long Cust_id;
 
	public Order() {
		// TODO Auto-generated constructor stub
	}
 
	public Order(Long id, LocalDate orderdate, LocalDate deliverydate, String status, Long cust_id) {
		super();
		this.id = id;
		this.orderdate = orderdate;
		this.deliverydate = deliverydate;
		this.status = status;
		Cust_id = cust_id;
	}
 
	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
 
	public LocalDate getOrderdate() {
		return orderdate;
	}
 
	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}
 
	public LocalDate getDeliverydate() {
		return deliverydate;
	}
 
	public void setDeliverydate(LocalDate deliverydate) {
		this.deliverydate = deliverydate;
	}
 
	public String getStatus() {
		return status;
	}
 
	public void setStatus(String status) {
		this.status = status;
	}
 
	public Long getCust_id() {
		return Cust_id;
	}
 
	public void setCust_id(Long cust_id) {
		Cust_id = cust_id;
	}
 
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderdate=" + orderdate + ", deliverydate=" + deliverydate + ", status=" + status
				+ ", Cust_id=" + Cust_id + "]";
	}
 
	
 

	
	

}
