package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
		
		Scanner inKey = new Scanner (System.in);
		
		System.out.print("Enter a positive integer: ");
		int base = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int exponent = inKey.nextInt();
		
		double square = Math.pow(base, exponent);
		
		System.out.print(base + "^" + exponent + " = " + square);
		System.out.println("\n");
		
		
		
	}
	
	
	
	public static void problem2() {
		
		Scanner inKey = new Scanner (System.in);
		
		System.out.print("Enter a positive integer: ");
		int input = inKey.nextInt();
		double sqrt = Math.sqrt(input);
		
		System.out.print("The square root of " + input + " is " + sqrt);
		System.out.println("\n");
	}
	
	
	
	public static void problem3() {
		
		Scanner inKey = new Scanner(System.in);       

        System.out.print("Length of side A:  ");                                                             
        double sideA = inKey.nextDouble();
        System.out.print("Length of side B: ");
        double sideB = inKey.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        System.out.println("Hypotenuse = " + hypotenuse);
        System.out.println("\n");
		
	}
	
	
	
	public static void problem4() {
		
		Scanner inKey = new Scanner(System.in);
		
		int input= inKey.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		while (input!= 0){
		   System.out.print("Enter an integer: ");
		    input = inKey.nextInt();
		    max= Math.max(max,input);
		    min= Math.min(min,input);
		     
		}

	
		  System.out.println("Max = "+ max);
		  System.out.println("Min = "+ min);
		  
}
	
	
}

