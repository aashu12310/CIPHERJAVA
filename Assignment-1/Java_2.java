package Assignment;
import java.util.Scanner;

class Base
{
    int width,height;
    Base(){
        this.width=0;
        this.height=0;
    }
    public void display(int width,int height)
    {
        this.width=width;
        this.height=height;
        System.out.println(width+" "+height);
    }
}

//Derived Class
class Java_2 extends Base
{
    double area;
    Scanner scan;
    Java_2(){
        scan=new Scanner(System.in);
    }
    public void read_input(){
        height = scan.nextInt();
        width = scan.nextInt();
    }
    public void disp(int a,int b){
        System.out.println(width + " "+ height);
    }
    public void display()
    {
        double c=super.width;
        double d=super.height;
        area=c*d;
        System.out.println(area);
    }

    public static void main(String [] args)
    {
    	Java_2 d=new Java_2();
        d.read_input();
        d.disp(d.width,d.height);
        d.display();
    }
}