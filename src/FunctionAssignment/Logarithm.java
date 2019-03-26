package FunctionAssignment;

// Tawseef Hanif
// Mr. Radulovic
// March 25, 2018
// Logarithm Class : Subclass of the Function class, this class defined a logarithm
// function with vertical stretch a, vertical translation b, and horizontal
// translation x1.

public class Logarithm extends Function{
	
	private double a, b, x1;
	private String s;

	Logarithm(double a, double b, double x1){
		super(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		this.a = a;
		this.b = b;
		this.x1 = x1;
	}

	@Override
	public double value(double x) {
		double value = a*Math.log(x-x1) + b;
		if (undefined(value) == false) {
		return value; } else {return Double.NaN;}
	}

	@Override
	public double derivative(double x) {
		double slope = a / (x-x1) ;
		if (undefined(slope) == false) {
			return slope; } else {return Double.NaN;}
	}

	@Override
	public String toString() {
		s = "y = (" + a + ")ln(x - (" + x1 + ")) + (" + b + ")";
		return s;
	}

}
