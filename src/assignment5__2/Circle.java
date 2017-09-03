package assignment5__2;



public class Circle extends Figure {    //extending abstract figure class  
	
	private final double pi=3.14;      //final variable declaration 

	Circle()                  //default constructor for circle
	{
		super();
	}
	
	Circle(double dim1)           //one parameter constructor 
	
	{
		super(dim1); 
		System.out.println(" ");
		System.out.println("Inside Circle object :");
	}
	
	public void findArea()         //overridden circle method for calculating area
	{
		double area=pi*dim1*dim1;
		System.out.println("Radius : " +dim1+ " units.");
		System.out.println("The area of circle is " +area + " sq units.");
	}
	
	public  void findPerimeter()        //overridden circle method for calculating perimeter
	{ 
		double peri=2*pi*dim1;
		System.out.println("The perimeter of circle is " + peri + " units.");
	}
	

}//class ends
