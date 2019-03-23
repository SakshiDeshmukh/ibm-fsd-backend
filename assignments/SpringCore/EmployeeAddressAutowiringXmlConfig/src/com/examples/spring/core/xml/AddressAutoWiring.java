package com.examples.spring.core.xml;

public class AddressAutoWiring {

	String city;
	String country;
	int pin;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return  "city=" + city + ", country=" + country + ", pin=" + pin ;
	}
	
	
	
}
