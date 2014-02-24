/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

	public void run() {

		// Get the starting position x,y for the base.
		int x = (getWidth() - (BRICK_WIDTH * BRICKS_IN_BASE)) / 2;
		int y = (getHeight() - BRICK_HEIGHT);

		// First loop deals with starting position for each layers of the
		// pyramid
		// and number of bricks needed for the next print.
		for (int i = 0; i < BRICKS_IN_BASE; i++) {

			int offSetY = y - (i * BRICK_HEIGHT);
			int offSetX = x + (i * (BRICK_WIDTH / 2));
			int brickInRow = BRICKS_IN_BASE - i;

			// Second loop deals with printing out the bricks.
			for (int j = 0; j < brickInRow; j++) {

				GRect bricks = new GRect(offSetX + (j * BRICK_WIDTH), offSetY,
						BRICK_WIDTH, BRICK_HEIGHT);
				add(bricks);

			}

		}
	}
}
