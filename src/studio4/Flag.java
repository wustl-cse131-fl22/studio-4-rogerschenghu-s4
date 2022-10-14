package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledRectangle(0.5, 0.5, 0.8, 0.2);
        StdDraw.setPenColor(StdDraw.WHITE);
      //  StdDraw.filledRectangle(0.1, 0.1, 0.8, 0.2);
        StdDraw.filledCircle(0.05, 0, 0.2);
		
	}
}