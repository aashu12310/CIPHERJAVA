package Assignment;

public class Java_4 {

	private double radius;
	private String color;
	double area;
	Java_4()
	{
		radius = 1.0;
        color = "red";
	}
	Java_4(double radius)
	{
		this.radius=radius;
	}
	
	public void getRadius()
	{
		System.out.println(radius);
	}
	public void getArea()
	{
		area=3.14*radius*radius;
		System.out.println(area);
	}
	
	public static void main(String [] args)
	{
		Java_4 c1=new Java_4();
		c1.getRadius();
		c1.getArea();
	}
}