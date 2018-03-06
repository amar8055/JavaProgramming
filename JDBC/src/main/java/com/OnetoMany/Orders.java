package com.OnetoMany;

public class Orders {

	private int Order_id;
	private String Order_Desc;
	private customer customer;
	public int getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(int order_id) {
		Order_id = order_id;
	}
	public String getOrder_Desc() {
		return Order_Desc;
	}
	@Override
	public String toString() {
		return "Orders [Order_id=" + Order_id + ", Order_Desc=" + Order_Desc + ", customer=" + customer + "]";
	}
	public void setOrder_Desc(String order_Desc) {
		Order_Desc = order_Desc;
	}
	public customer getCustomer() {
		return customer;
	}
	public void setCustomer(customer customer) {
		customer = customer;
	}
	
	
	
	
}
