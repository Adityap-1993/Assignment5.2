package assignment5__2;

public class Main {      //main class definition 

	public static void main(String[] args) {    //main method starts here 
		// TODO Auto-generated method stub
           Rectangle R1=new Rectangle(40,50);          //rectangular object 
           
           R1.findArea();
		   R1.findPerimeter();
		   
		   Circle C1=new Circle(7.0);               //circle object 
		   
		   C1.findArea();
		   C1.findPerimeter();
		   
		   Triangle T1=new Triangle(10,20);          //Triangle object 
		   Triangle T2=new Triangle (30,20,50);
		   T1.findArea();
		   T2.findPerimeter();
	}

}//class ends
