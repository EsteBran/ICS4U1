package FunctionAssignment;

// Tawseef Hanif
// Mr. Radulovic
// March 25, 2018
// Quadratic Class : Subclass of the Function Class, this class defines a quadratic
// polynomial of degree 2 with coefficients a and b, y-intercept c, and a point at
// (-x1 , 1).

public class Quadratic extends Function{
	
	private double a, b, c, x1;
	private String s;

	Quadratic(double a, double b, double c, double x1) {
		super(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		this.a = a;
		this.b = b;
		this.c = c;
		this.x1 = x1;
	}

	@Override
	public double value(double x) {
		double value = a*(x-x1)*(x-x1) + b*(x-x1) + c;
		if (undefined(value) == false) {
			return value; } else {return Double.NaN;}
	}

	@Override
	public double derivative(double x) {
		double slope = 2*a*(x-x1) + b;
		if (undefined(slope) == false) {
			return slope; } else {return Double.NaN;}
	}

	@Override
	public String toString() {
		s = "y = (" + a + ")(x - (" + x1 + "))^2 + (" + b + ")(x - (" + x1 + ")) + (" + c + ")";
		return s;
	}

}
