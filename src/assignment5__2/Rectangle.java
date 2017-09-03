package assignment5__2;

public class Rectangle extends Figure {    //Rectangle class extending abstract figure class 
	
	Rectangle()                //default constructor for Rectangle 
	{
		super();
	}
	
	Rectangle(double dim1,double dim2)            //Two parameter constructor 
	{
		super(dim1,dim2);
		System.out.println("Inside Rectangle object :");
	}
	
	public void findArea() {                   //overridden rectangle method for finding area  
		double area=dim1*dim2;
		System.out.println("Length : " +dim1 + " units.");
		System.out.println("Breadth : " +dim2 + " units.");
		System.out.println("The area of Rectangle is " + area+ " Sq units." );
	}
	
	public void findPerimeter()           //overridden rectangle method for finding perimeter 
	{
		double peri=2*(dim1+dim2);
		System.out.println("The perimeter of Rectangle is " +peri+ " units.");
	}
	

} //class ends
