/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {

	//Constant variable to terminate program.
	private static final int SENTINAL = 1;
	
	public void run() {

		//Assign user's input to variable x.
		int x = readInt("Enter a number: ");
		int y; 
		int i = 0;
		
		while (true){
			
			if (x == SENTINAL || x == 0) break;
			if (x % 2 == 0){
				
				y = (x / 2);
				println(x + " is even, so I take half: " + y);
				x = y;
				i++;
				
			} else {
				
				y = (3 * x) + 1;
				println(x + " is odd, so I make 3n + 1: " + y);
				x = y;
				i++;
				
			}
			
		}
		
		println("The process took " + i + " steps to reach 1.");
	}
}
