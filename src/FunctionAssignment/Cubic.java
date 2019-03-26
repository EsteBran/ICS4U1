package FunctionAssignment;

// Tawseef Hanif
// Mr. Radulovic
// March 25, 2018
// Cubic Class: Subclass of the Function Class, this class defines a cubic polynomial
// function with coefficients a, b, and c; point at (-x1, 1) ; and vertical
// translation of d.

public class Cubic extends Function{
	
	private double a, b, c, d, x1;
	private String s;

	Cubic(double a, double b, double c, double d, double x1) {
			super(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.x1 = x1;
		}

	@Override
	public double value(double x) {
		double value = a*(x-x1)*(x-x1)*(x-x1) + b*(x-x1)*(x-x1) + c*(x-x1) + d;
		if (undefined(value) == false) {
			return value; } else {return Double.NaN;}
	}

	@Override
	public double derivative(double x) {
		double slope = 3*a*(x-x1)*(x-x1) + 2*b*(x-x1) + c;
		if (undefined(slope) == false) {
			return slope; } else {return Double.NaN;}
	}

	@Override
	public String toString() {
		s = "y = (" +  a + ")" + "(x - (" + x1 + "))^3 + (" + b + ")(x - (" + x1 + "))^2 + (" + c +  ")(x - (" + x1 + ")) + (" + d + ")";
		return s;
	}
}
