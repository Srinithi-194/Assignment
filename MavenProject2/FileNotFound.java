package com.mphasis.MavenProject2;

import java.io.File;
import java.io.FileNotFoundException;
public class FileNotFound {
	
	public static void useFile(File f) throws FileNotFoundException {
		if(!f.exists()) {
			throw new FileNotFoundException();
		}
	}
	
	public static void main(String arg[]) throws FileNotFoundException {

		File f=new File("demo.txt");
		useFile(f);
	
	}

}
