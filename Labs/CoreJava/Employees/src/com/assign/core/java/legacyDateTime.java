package com.assign.core.java;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class legacyDateTime {
//TemporalAdjusters,Period(between 2 months),Zone,LocalDateTime,Instant,Clock,Date,Chrono,format
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//todays date
         Date today = new Date();
         System.out.println(today);
         //yesterdays date
         Date yesterday = new Date("2019/02/13 14:30:40");
         System.out.println(yesterday);
         //Todays Using Calender
         Calendar todayC = Calendar.getInstance();
         System.out.println(todayC.getTime());

         //todays date using instant
         Instant currenttimeInst = Instant.now();
         System.out.println(currenttimeInst);
	}

}
