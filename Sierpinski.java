/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		double h = Math.sqrt(3) / 2.0;
        sierpinski(n, 0.0, 1.0, 0.5, 0.0, 0.0, h);
    }
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		if (n == 0) {
            return;
        }
        StdDraw.line(x1, y1, x2, y2);
        StdDraw.line(x2, y2, x3, y3);
        StdDraw.line(x3, y3, x1, y1);
        double xMidOf12 = (x1 + x2) / 2.0;
        double yMidOf12 = (y1 + y2) / 2.0;
        double xMidOf23 = (x2 + x3) / 2.0;
        double yMidOf23 = (y2 + y3) / 2.0;
        double xMidOf31 = (x3 + x1) / 2.0;
        double yMidOf31 = (y3 + y1) / 2.0;
        sierpinski(n - 1, x1, xMidOf12, xMidOf31, y1, yMidOf12, yMidOf31);
        sierpinski(n - 1, xMidOf12, x2, xMidOf23, yMidOf12, y2, yMidOf23);
        sierpinski(n - 1, xMidOf31, xMidOf23, x3, yMidOf31, yMidOf23, y3);
    }
}