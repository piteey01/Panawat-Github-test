/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

	// Sentinal variable to terminate the program.
	private static final int SENTINAL = 0;

	public void run() {

		// Create min and max variables for comparison.
		int max = 0;
		int min = 0;

		println("This program finds largest and smallest numbers.");
		int num = readInt("? ");

		// Check for first enter sentinal.
		if (num == SENTINAL) {
			println("Program terminated, no number entered!");
		} else {
			max = min = num;

			while (true) {

				num = readInt("? ");
				if (num == SENTINAL)
					break;

				// Compare and assign min and max as appropriate.
				if (max < num) {
					max = num;
				} else if (min > num) {
					min = num;
				}

			}

			println("Smallest number is: " + min);
			println("Largest number is: " + max);
		}

	}
}
