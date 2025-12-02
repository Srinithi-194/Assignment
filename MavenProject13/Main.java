package com.mph.MavenProject13;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			System.out.println("object creating");
			MyClass.listItem.add(new int[100000000]);
		}
	}

}

class MyClass{
	static List<int[]> listItem=new ArrayList<int[]>();
}
