package com.mph.MavenProject3;

import java.util.function.Supplier;

public class DemoOnSupplier {

	public static void main(String[] args) {
		
		String name="Srinithi";
		Supplier<String> supplier=()->name.toUpperCase();
		System.out.println(supplier.get());
		
		Supplier<Integer> randomSupplier=()->{
			return (int)Math.round(Math.random()*10000);
		};
		System.out.println(randomSupplier.get());
		
		int a=67,b=88;
		Supplier<Integer> maxSupplier=()->{
			return (a>b?a:b);
		};
		System.out.println(maxSupplier.get());

	}

}
