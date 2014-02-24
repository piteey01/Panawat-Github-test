/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {

	/* Declare constant variables for the box width and height */
	private static final int BOX_WIDTH = 120;
	private static final int BOX_HEIGHT = 50;

	public void run() {

		// Get middle points x,y of the application.
		double x = getWidth() / 2;
		double y = getHeight() / 2;

		addProgramBoxes(x, y);

	}

	/*
	 * addProgramBoxes create box objects and labels objects and add them to the
	 * set location.
	 */

	private void addProgramBoxes(double topBox_x, double topBox_y) {

		// Create the top half y-location for the box
		topBox_y = topBox_y / 2;

		// Create the top half x-location for the box
		topBox_x = topBox_x - (BOX_WIDTH / 2);

		// Create first box with program label located in the middle
		GRect box1 = new GRect(topBox_x, topBox_y, BOX_WIDTH, BOX_HEIGHT);
		add(box1);

		GLabel program = new GLabel("Program");
		double proX = topBox_x + (BOX_WIDTH - program.getWidth()) / 2;
		double proY = topBox_y + (BOX_HEIGHT + program.getAscent()) / 2;
		add(program, proX, proY);

		// Call another method to deals with bottom half of the chart.
		addProgramBoxesBottom(topBox_x, topBox_y);

		addProgramLines(topBox_x, topBox_y);

	}

	private void addProgramBoxesBottom(double bottom_x, double bottom_y) {

		// Set the bottom half y-location for the box at twice the distance
		// from the top of the application windows.
		bottom_y += bottom_y;

		// Create box2 and it's label for the chart.
		GRect box2 = new GRect(bottom_x, bottom_y, BOX_WIDTH, BOX_HEIGHT);
		add(box2);

		GLabel con = new GLabel("ConsoleProgram");
		double cX = bottom_x + (BOX_WIDTH - con.getWidth()) / 2;
		double cY = bottom_y + (BOX_HEIGHT + con.getAscent()) / 2;
		add(con, cX, cY);

		// Create box3 and it's label.
		double box3OffSet = bottom_x - (BOX_WIDTH + BOX_WIDTH / 4);
		GRect box3 = new GRect(box3OffSet, bottom_y, BOX_WIDTH, BOX_HEIGHT);
		add(box3);

		GLabel gra = new GLabel("GraphicsProgram");
		double gX = box3OffSet + (BOX_WIDTH - gra.getWidth()) / 2;
		double gY = bottom_y + (BOX_HEIGHT + gra.getAscent()) / 2;
		add(gra, gX, gY);

		// Create box4 and it's label.
		double box4OffSet = bottom_x + (BOX_WIDTH + BOX_WIDTH / 4);
		GRect box4 = new GRect(box4OffSet, bottom_y, BOX_WIDTH, BOX_HEIGHT);
		add(box4);

		GLabel dia = new GLabel("DialogProgram");
		double dX = box4OffSet + (BOX_WIDTH - dia.getWidth()) / 2;
		double dY = bottom_y + (BOX_HEIGHT + dia.getAscent()) / 2;
		add(dia, dX, dY);

	}

	private void addProgramLines(double lineX, double lineY) {

		// Set line position x,y with regards to the top box.
		double topLineX = lineX + (BOX_WIDTH / 2);
		double topLineY = lineY + BOX_HEIGHT;

		// Set line position x,y with regards to the bottom box on the left.
		double bottomLineX = (lineX - (BOX_WIDTH + BOX_WIDTH / 4)) + BOX_WIDTH
				/ 2;
		double bottomLineY = (lineY * 2);

		for (int i = 0; i < 3; i++) {

			GLine line = new GLine(topLineX, topLineY, bottomLineX
					+ (i * (BOX_WIDTH + BOX_WIDTH / 4)), bottomLineY);
			add(line);

		}

	}

}
