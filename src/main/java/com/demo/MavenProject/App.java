package com.demo.MavenProject;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setEmpName("Srinithi");
        e.setEmpId(101);
        e.setDesg("CSE");
        e.setMobileNum("9876543210");
        
//        System.out.println(e.getEmpId());
//        System.out.println(e.getEmpName());
//        System.out.println(e.getDesg());
//        System.out.println(e.getMobileNum());
        
        System.out.println(e);
        
        Employee e1=new Employee("Gayathri",102,"CSE","9876543211");
        System.out.println(e1);
    }
}
