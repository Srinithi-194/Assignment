package com.mph.MavenProject10;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {45,87,76,34,90,78,23};
		System.out.println("Enter Search elements");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("element found" + arr[i] +" "+ i);
				break;
			}
			
		}
		if(i==arr.length)
		{
			System.out.println("Not found");
		}


	}

}
