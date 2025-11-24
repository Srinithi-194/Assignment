package com.mphasis.MavenProject2;
import java.util.*;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer buff=new StringBuffer();
		buff.append("Srinithi");
		buff.append("Bala");
		buff.append("Padma");
		System.out.println(buff);
		System.out.println(buff.capacity());
		
		StringBuilder sbl=new StringBuilder("Srinithi Bala");
		//sbl.replace(7, 9, "*");
		System.out.println(sbl.reverse());
		
		String str="apple,banana,orange,pineapple";
		StringTokenizer tokenizer=new StringTokenizer(str,",");
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		
		//StringJoiner sj=new StringJoiner();
		

	}

}
