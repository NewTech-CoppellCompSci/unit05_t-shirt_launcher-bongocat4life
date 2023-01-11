package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		
		//Psuedo-Code:
		//Get starting launch angle and velocity from the user While the t-shirt hasn't hit the ground
		//Print current stats (time, location, etc.)
		//Increment time
		//Calculate new X and Y positions
		//t-shirts don't generally burrow into the ground, they should stop at 0
		
		System.out.println("Welcome to New  Tech High's 2023 T-shirt launcher, generously donated by our cheerleaders! For the Cowboys fans out there, try your luck at catching a signed t-shirt of your favorite team!!! But first we must calculate the trajectory of the shirts.... ");
		System.out.println();
		
		Scanner inKey = new Scanner (System.in);
		
		System.out.println("Enter launch velocity (m/s) >>> ");
		double velocity = inKey.nextDouble();
		
		System.out.println("Enter launch angle (degrees) >>> ");
		double angle = inKey.nextDouble();
		
		double xpos = 0;
		double ypos = 1;
		int time = 0;
		boolean ground = true;
		System.out.println();
		System.out.println("Projectile's path: \n");
		
		while (ground) {
			
			xpos = Math.cos(Math.toRadians(angle)) * time * velocity;
			ypos = Math.sin(Math.toRadians(angle)) * time * velocity - 0.5 * 9.8 * Math.pow(time, 2);
				if (ypos<0) {
					ground = false;
					ypos = 0;
				}
				
			System.out.println("Time: " + time + "s\n");
			System.out.println("x-position: " + xpos + "m\n");
			System.out.println("y-position: " + ypos + "m\n");
			
			time++;
			
		}
		
		
		
	}
	
}
