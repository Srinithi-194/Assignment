package com.mphasis.MavenProject2;

import java.util.Arrays;

public class DemoUtilityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {50,30,20,40,10};
		System.out.println(Arrays.toString(arr));
		String nums=Arrays.toString(arr);
		System.out.println(nums);
		Arrays.sort(arr);
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
		System.out.println(Arrays.binarySearch(arr, 30));
		
		int[] arr1= {50,30,20,40,10
				};
		System.out.println(Arrays.equals(arr, arr1));

	}

}
