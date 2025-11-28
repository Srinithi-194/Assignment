
package com.mph.MavenProject11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoOnByteStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		BufferedReader reader=new BufferedReader(new FileReader("assets/data.txt"));
//		String data;
//		while((data=reader.readLine())!=null) {
//			System.out.println(data);
//		}
//		
//		BufferedWriter writer=new BufferedWriter(new FileWriter("assets/data.txt"));
//		writer.newLine();
//		writer.write("modification with buffer writer");
//		writer.close();
		
//		FileOutputStream fos=new FileOutputStream("assets/info.txt");
//		String text="Srinithi";
//		fos.write(text.getBytes());
//		fos.close();
//		
//		FileInputStream fis=new FileInputStream("assets/info.txt");
//		int b;
//		while((b=fis.read())!=-1) {
//			System.out.println((char)b);
//			
//		}
//		fis.close();

		Bottle b=new Bottle(1,"Cello",500,"orange");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("assets/bottleInfo.txt"));
		oos.writeObject(b);
		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("assets/bottleInfo.txt"));
		Bottle b1=(Bottle) ois.readObject();
		System.out.println(b1);
				 

	}

}
