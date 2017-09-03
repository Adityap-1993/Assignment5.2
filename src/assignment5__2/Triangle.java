package assignment5__2;

public class Triangle extends Figure {         //extending abstract class figure

	Triangle()                   //default constructor 
	{
		super();
		
	}
	
	Triangle(double dim1,double dim2)      //two parameter constructor for calculating area 
	{
		super(dim1,dim2);
		System.out.println(" ");
		System.out.println("Inside Triangle object :");
		
	}
	
	Triangle(double dim1,double dim2,double dim3)   //three parameter constructor for calculating perimeter  
	{
		super(dim1,dim2,dim3);
		
	}
	
	public void findArea()          //overridden method for calculating triangle area  
	{
		double area=(dim1*dim2)/2;
		System.out.println("Height : " +dim1+ " units.");
		System.out.println("Base : " +dim2+ " units.");
		System.out.println("The area of Triangle is " +area+ " sq units." );
	}
	public void findPerimeter()       //overridden method for calculating perimeter
	{
		double peri=dim1+dim2+dim3;
		System.out.println("Side 1 : " +dim1+ " units.");
		System.out.println("Side 2 : " +dim2+ " units.");
		System.out.println("Side 3 : " +dim3+ " units.");
		System.out.println("The perimeter of Triangle is " +peri+ " units.");
	}
	
}//class ends
