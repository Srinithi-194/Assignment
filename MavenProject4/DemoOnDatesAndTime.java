package com.mph.MavenProject4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoOnDatesAndTime {

	public static void main(String[] args) throws ParseException {
		Date curDate=new Date();
		System.out.println(curDate);
		
		long ms=System.currentTimeMillis();
		System.out.println(ms);
		Date currentDate=new Date(ms);
		System.out.println(currentDate);
		
		long msl=12345677890l;
		Date myDate=new Date(msl);
		System.out.println(myDate);
		
		Date newDate=new Date(2004-1900,9-1,01);
		System.out.println(newDate);
		
		System.out.println(curDate.getDate()+3);
		System.out.println(curDate.getDay());
		System.out.println(curDate.getYear()+1900);
		
		Date date1=new Date(2025,01,24);
		Date date2=new Date(2023,01,24);
		System.out.println(date1.after(date2));
		
	
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(curDate);
		
		String str="24-11-2025";
		
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		Date d=sdf1.parse(str);
		System.out.println(d);
		
		

	}

}
