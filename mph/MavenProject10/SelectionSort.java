package com.mph.MavenProject10;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {67,4,56,34,23,1,98};
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
//				if(min!=i) {
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp; 
				
//				}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
