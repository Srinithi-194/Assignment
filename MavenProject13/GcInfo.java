package com.mph.MavenProject13;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GcInfo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Requesting GC");
		System.gc();
		Thread.sleep(1000);
		
		List<GarbageCollectorMXBean> gcBean=ManagementFactory.getGarbageCollectorMXBeans();
		for(GarbageCollectorMXBean gcmx:gcBean) {
			System.out.println("Gc Name : " + gcmx.getName());
			System.out.println("Count : " +gcmx.getCollectionCount());
			System.out.println("Time(ms) : " + gcmx.getCollectionTime());
		}
		

	}
	protected void finalize() throws Throwable{
		System.out.println("Garbage collected");
	}

}
