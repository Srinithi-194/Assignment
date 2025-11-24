package com.mph.MavenProject4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		LocalDateTime lt=LocalDateTime.of(2024,11,22,15,45,40);
		String str=df.format(lt);
		System.out.println(str);
		
		

	}

}
