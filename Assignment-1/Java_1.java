package Assignment;

import java.util.Scanner;

class Java_1 {
    interface add{
        public int add(int a,int b);
    }
    interface difference {
        public int difference(int a,int b);
    }
    interface product{
        public int product(int a,int b);
    }
    interface safeDivision{
        public float safeDivision(int a, int b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();
        add add = (int input1,int input2)-> input1+input2;
        difference difference = (int input1,int input2) -> input1-input2;
        product product = (int input1,int input2)->input1*input2;
        safeDivision division = (int input1, int input2)-> input1/input2;
        System.out.println("1.Addition \n2.Difference \n3.Product \n4.SafeDivision");
        System.out.println("Enter the option");
        int option=scan.nextInt();
        switch (option)
        {
            case 1:
            	System.out.println(add.add(a,b));
            	break;
            case 2:
            	System.out.println(difference.difference(a,b));
            	break;
            case 3:
            	System.out.println(product.product(a,b));
            	break;
            case 4:
            	System.out.println(division.safeDivision(a,b));
            	break;
        }
    }
}