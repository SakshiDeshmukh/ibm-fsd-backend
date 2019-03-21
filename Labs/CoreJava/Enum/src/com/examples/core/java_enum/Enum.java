package com.examples.core.java_enum;



public class Enum {
	public enum WeekDays { //Weekdays is a class
		
		Mon{
			public String DisplayAll() {
				return "MONDAY";
			}
		},
		Tue,
		Wed,
		Thurs,
		Fri,
		Sat,
		Sun;
		private int dayindex;//variable
		private WeekDays() {
			System.out.println("default Constructor");
		}
		
		private WeekDays(Integer dayindex) {//constructor
			System.out.println("enum ctor");
			this.dayindex= dayindex;


		}
		public int getdayIndex() {
			return this.dayindex;
		}
		public String DisplayAll() {//generic method common for all
			return "methodtest";
		}
	};   
	public interface test{
		
	}
	
 static void main(String[] args) {
		String day ="Mon";
		//String Comparison
		if(WeekDays.Mon.toString()== day) //convert enum into string toString() fun is used -- 1st method
		{
			System.out.println("day is monday");
		}
		//Enum Comparison
		if(WeekDays.Mon == WeekDays.valueOf(day)) //convert String into enum ..valueOf() fun is used --2nd 
		{
			System.out.println("day is monday");
		}
		
		//get all enum values:
		for(Object weekday:WeekDays.values()) {
			System.out.println(weekday);
		}
		System.out.println(WeekDays.Mon.DisplayAll());
		
		WeekDays[] arr = WeekDays.values();
		System.out.println(arr[0]);
	}
	

}
