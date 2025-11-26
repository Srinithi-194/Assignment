package com.mph.MavenProject6;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        DBConnection conn1=DBConnection.getInstance();
//        System.out.println(conn1.hashCode());
//        DBConnection conn2=DBConnection.getInstance();
//        System.out.println(conn2.hashCode());
//        DBConnection conn3=DBConnection.getInstance();
//        System.out.println(conn3.hashCode());
    	
    	
//    	Shape s=ShapesFactory.getShape("square");
//    	s.draw();
    	
    	
    	
//    	GUIFactory gui=new WinFactory();
//    	Button button=gui.createButton();
//    	CheckBox checkBox=gui.createCheckBox();
//    	button.click();
//    	checkBox.check();
//    	
//    	
//    	GUIFactory gui1=new MacFactory();
//    	Button b1=gui1.createButton();
//    	CheckBox c1=gui1.createCheckBox();
//    	b1.click();
//    	c1.check();
    	
    	
//    	Pizza pizza=new Pizza.Builder("Medium").cheese(true).olives(false).build();
//    	System.out.println(pizza);
    	
    	
    	DrinkMaker tea=new TeaMaker();
    	tea.prepareDrink();
    	DrinkMaker coffee=new CoffeeMaker();
    	coffee.prepareDrink();
    	
    	
    }
}
