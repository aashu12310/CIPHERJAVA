package Assignment;

import java.util.Scanner;

public class Java_3 {
    int id;
    String name;
    float salary;
    String designation;
    String location;
    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the following details :: ");
        System.out.println("EMPID : ");
        id = in.nextInt();
        System.out.print("NAME : ");
        name = in.next();
        System.out.print("SALARY : ");
        salary = in.nextFloat();
        System.out.print("DESIGNATION : ");
        designation = in.next();
        System.out.print("LOCATION : ");
        location = in.next();
    }
    public void setnames() {
        System.out.println("Employee name = " + name);
    }
    public void setsalary() {
        if(salary>50000) {
            System.out.println("Employee salary = " + salary);
        }
    }
    public void setloc() {
        if(location.charAt(1)=='M'|| location.charAt(1)=='m') {
            System.out.println("Employee salary = " + location);
        }
    }
    public void setdesig() {
        if(designation.charAt(designation.length()-1)=='E'||designation.charAt(designation.length()-1)=='e') {
            System.out.println("Employee salary = " + designation);
        }
    }
    public static void main(String[] args) {
        Java_3[] e = new Java_3[10];
        System.out.println("Entered data for 10 employees");
        for(int i=0; i<10; i++) {

            e[i] = new Java_3();
            e[i].getInput();
        }
        for(int i=0;i<10;i++) {
        	e[i].setnames();
        	System.out.print("\t");
        	e[i].setsalary();
        	System.out.print("\t");
        	e[i].setloc();
        	System.out.print("\t");
        	e[i].setdesig();
        }
    }
}