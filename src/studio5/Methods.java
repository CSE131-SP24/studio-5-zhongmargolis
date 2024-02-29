package studio5;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		double xsum = (x2-x1) * (x2-x1);
		double ysum = (y2-y1) * (y2-y1);
		double distance = Math.sqrt((xsum + ysum));

		return distance;
	}

	public static void drawBullsEye(double x, double y, double radius) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);

		StdDraw.setPenColor(0, 109, 219);
		StdDraw.filledCircle(x, y, .75*radius);

		StdDraw.setPenColor(146, 0, 0);
		StdDraw.filledCircle(x, y, .5*radius);

		StdDraw.setPenColor(255, 255, 109);
		StdDraw.filledCircle(x, y, .25*radius);
	}

	public static String substituteAll(String source, char target, String replacement) {
		String result = "";

		for (int i = 0; i < source.length(); i++) {
			if (source.charAt(i) == target) {
				result = result + replacement;
			}
			else {
				result = result + source.charAt(i);
			}
		}

		return result;
	}

	public static int arraySum(int[] values) {
		int sum = 0;
		for (int i  = 0; i < values.length; i++) {
			sum = sum + values[i];
		}

		return sum;
	}

	public static int[] filledArray(int length, int value) {
		int[] values = new int[length];
		for (int i = 0; i < values.length; i++) {
			values[i] = value;
		}
		return values;
	}
	
	public static double arrayMean(int[] values) {
		return arraySum(values) / values.length;
	}
	
	/**
	 * method arrayMean calculates the mean value of an integer array
	 * @param values	integer array
	 * @result			mean of array
	 */


}
