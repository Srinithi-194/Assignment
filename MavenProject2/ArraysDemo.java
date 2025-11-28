package com.mphasis.MavenProject2;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruits fruitsArr[] = new Fruits[5];
		Fruits fruit1=new Fruits("apple","red",120.50);
		Fruits fruit2=new Fruits("grapes","green",60);
		Fruits fruit3=new Fruits("Orange","oranga",70.56);
		Fruits fruit4=new Fruits("Mango","yellow",90.23);
		Fruits fruit5=new Fruits("Banana","Red",20);
		fruitsArr[0]=fruit1;
		fruitsArr[1]=fruit2;
		fruitsArr[2]=fruit3;
		fruitsArr[3]=fruit4;
		fruitsArr[4]=fruit5;
		
		for(int i=0;i<fruitsArr.length;i++) {
			System.out.println("Cost Per dozen for " + fruitsArr[i].getFruitName() + " is" + " " + fruitsArr[i].calculatCostPerPerson());
		}

	}

}
