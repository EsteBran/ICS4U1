package FunctionAssignment;

// Tawseef Hanif
// Mr. Radulovic
// March 25, 2018
// Parabola Class : Subclass of the Function class, this class defines a parabola, aka
// degree 2 polynomial function with vertical stretch a, and vertex at (-x1 , b).

public class Parabola extends Function{
	
	private double a, b, x1;
	private String s;

	Parabola(double a, double b, double x1) {
		super(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		this.a = a;
		this.b = b;
		this.x1 = x1;
	}

	@Override
	public double value(double x) {
		double value = a*(x-x1)*(x-x1) + b;
		if (undefined(value) == false) {
			return value; } else {return Double.NaN;}
	}

	@Override
	public double derivative(double x) {
		double slope = 2*a*(x-x1);
		if (undefined(slope) == false) {
			return slope; } else {return Double.NaN;}
	}

	@Override
	public String toString() {
		s = "y = " + a + "(x - (" + x1 + "))^2 + (" + b + ")";
		return s;
	}

}
