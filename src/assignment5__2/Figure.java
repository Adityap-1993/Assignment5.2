package assignment5__2;

public abstract class Figure {      //abstract class definition
	
	
	
	protected double dim1,dim2,dim3;   //instance variables 
	
	Figure()                            //default constructor
	{
		this.dim1=-1;
		this.dim2=-1;
	    this.dim3=-1;
		
	}
	
	
	Figure(double dim1){           //one parameter constructor 
		
		this.dim1=dim1;
	}
	
	Figure(double dim1,double dim2)   //two parameter constructor 
	
	{
		this.dim1=dim1;
		this.dim2=dim2;
	}
	
	Figure(double dim1,double dim2,double dim3)      //three parameter constructor 
	{
		this.dim1=dim1;
		this.dim2=dim2;
		this.dim3=dim3;
	}
	
	
	public abstract void findArea();         //abstract method for finding area 
	
	
	
	public abstract void findPerimeter();      //abstract method for finding perimeter

}// class ends
