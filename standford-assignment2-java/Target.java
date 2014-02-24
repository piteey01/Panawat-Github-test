/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {

	/*
	 * Declared circles size, where smaller ones depend on the size of the
	 * biggest one.
	 */

	private static final double OUTER_CIRCLE = 72;
	private static final double MIDDLE_CIRCLE = OUTER_CIRCLE * 0.65;
	private static final double INNER_CIRCLE = OUTER_CIRCLE * 0.3;

	public void run() {

		/* Get center position x,y of the screen */
		double x = getWidth() / 2;
		double y = getHeight() / 2;

		addCircles(x, y);

	}

	private void addCircles(double fx, double fy) {

		// Find center position for first circle fx, fy.
		fx = fx - OUTER_CIRCLE;
		fy = fy - OUTER_CIRCLE;

		GOval circle1 = new GOval(fx, fy, OUTER_CIRCLE * 2, OUTER_CIRCLE * 2);
		circle1.setFilled(true);
		circle1.setFillColor(Color.red);
		add(circle1);

		// Call another method to add the second circle using the
		// position fx, fy of the first.
		addSecondCircle(fx, fy);
	}

	private void addSecondCircle(double sx, double sy) {

		sx = sx + (OUTER_CIRCLE - MIDDLE_CIRCLE);
		sy = sy + (OUTER_CIRCLE - MIDDLE_CIRCLE);

		GOval circle2 = new GOval(sx, sy, MIDDLE_CIRCLE * 2, MIDDLE_CIRCLE * 2);
		circle2.setFilled(true);
		circle2.setFillColor(Color.white);
		add(circle2);

		addThirdCircle(sx, sy);
	}

	private void addThirdCircle(double tx, double ty) {

		tx = tx + (MIDDLE_CIRCLE - INNER_CIRCLE);
		ty = ty + (MIDDLE_CIRCLE - INNER_CIRCLE);

		GOval circle3 = new GOval(tx, ty, INNER_CIRCLE * 2, INNER_CIRCLE * 2);
		circle3.setFilled(true);
		circle3.setFillColor(Color.red);
		add(circle3);

	}
}
