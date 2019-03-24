package com.examples.spring.core.xml;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Sangamner")
	String city;
	@Value("India")
	String country;
	@Value("422605")
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
