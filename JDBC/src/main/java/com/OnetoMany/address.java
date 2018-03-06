package com.OnetoMany;

public class address {

	private Integer id;
	private String city;
	private String state;
	private String country;
	private Integer zip;
	
	public address(){}
	public address(Integer id, String city, String state, String country, Integer zip) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
}
	
	 
	
	
	
	
	


