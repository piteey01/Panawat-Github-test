/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {

		println("Enter values to compute Pythagorean theorem.");
		int a = readInt("a: ");
		int b = readInt("b: ");

		a = (int) Math.pow(a, 2);
		b = (int) Math.pow(b, 2);

		int x = a + b;
		double c = Math.sqrt(x);
		println("c = " + c);

	}
}
