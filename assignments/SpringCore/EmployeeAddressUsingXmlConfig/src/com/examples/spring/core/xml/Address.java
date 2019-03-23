package com.examples.spring.core.xml;

public class Address {

	String city;
	String country;
	int pin;
	public Address(String city, String country, int pin) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return  "city=" + city + ", country=" + country + ", pin=" + pin ;
	}
	
	
	
}
