package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		
		Scanner inKey = new Scanner (System.in);
		
		System.out.print("Enter a positive integer: ");
		int one = inKey.nextInt();
		System.out.print("Enter a positive integer: ");
		int two = inKey.nextInt();
		
		for (int i = 0; i < 100; i++) {
			System.out.print((int) (Math.random() * (Math.max(one,two) - Math.min(one, two) + 1)) 
							+ Math.min(one, two) 
							+ " ");
		} 

		System.out.println("\n");
	}
	
	
	public static void problem2() {
		
		Scanner inKey = new Scanner (System.in);
		
		System.out.print("What  is the radius of the cylinder? ");
		double radius = inKey.nextDouble();
		System.out.print("What is the height of the cylinder? ");
		double height = inKey.nextDouble();
		
		double volume = Math.PI * (radius * radius) * height;
		
		System.out.print("The volume of the cylinder is: " + volume + " .");
		
		System.out.println("\n");
	}


	public static void problem3() {
		
		 Scanner inKey = new Scanner(System.in);
		 System.out.print("What is the x-value of the first coordinate? ");
		 double x1 = inKey.nextDouble();
		 System.out.print("What is the y-value of the first coordinate? ");
		 double y1 = inKey.nextDouble();
		 System.out.print("What is the x-value of the second coordinate? ");
		 double x2 = inKey.nextDouble();
		 System.out.print("What is the y-value of the second coordinate? ");
		 double y2 = inKey.nextDouble();
		 double d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	       
		 System.out.print("Distance between points = "+d);
		 
		 System.out.println("\n");
	   }

	
	
	public static void problem4() {
		
		Scanner inKey = new Scanner(System.in);  
		System.out.print("Enter a-value: ");  
		double a =  inKey.nextDouble();  
		System.out.print("Enter b-value: ");  
		double b = inKey.nextDouble();  
		System.out.print("Enter c-value: ");  
		double c = inKey.nextDouble();  
		
		double d = b * b - 4.0 * a * c;  
		
		if (d > 0.0)   {  
		double x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
		double x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
		System.out.println("x1= " + x1 + " and x2= " + x2);  
		}   
		
		else if (d == 0.0)   {  
		double x1 = -b / (2.0 * a);  
		System.out.println("The root is " + x1);  
		}   
		
		else {  
		System.out.println("Roots are not real.");  
		}  
		
	}  
}

