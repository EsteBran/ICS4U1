package FunctionAssignment;

// Tawseef Hanif
// Mr. Radulovic
// March 25, 2018
// Linear Class : Subclass of the Function class, this class defined a linear function
// with slope m, horizontal translation x1, and vertical translation of b.

public class Linear extends Function{
	
	private double m, b, x1;
	private String s;
	
	Linear(double m, double b, double x1) {
		super(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		this.m = m;
		this.b = b;
		this.x1 = x1;
	}
	

	@Override
	public double value(double x) {
		double value = m*x + b;
		if (undefined(value) == false) {
			return value; } else {return Double.NaN;}
	}

	@Override
	public double derivative(double x) {
		double slope = this.m;
		if (undefined(slope) == false) {
			return slope; } else {return Double.NaN;}
	}


	@Override
	public String toString() {
		s = "y = " + m + "(x - " + x1 + ") + " + "(" + b + ")" ;
		return s;
	}

}
