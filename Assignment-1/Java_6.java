package Assignment;

class Employee
{
    public String name;
    public int Year_of_joining;
    public String address;
    Employee(String name, int Year_of_joining,String address){
        this.name=name;
        this.Year_of_joining=Year_of_joining;
        this.address=address;
    }
}
public class Java_6
{
    public static void main(String args[])
    {
        Employee[] arr;
        arr=new Employee[5];
        arr[0]=new Employee("Robert",1994,"64C-Wallstreet");
        arr[1]=new Employee("Sam",2000,"68D-Wallstreet");
        arr[2]=new Employee("John",1999,"26C-Wallstreet");
        for(int i=0;i<arr.length;i++)
           System.out.println(arr[i].name+" "+arr[i].Year_of_joining+" "+arr[i].address);
    }
}