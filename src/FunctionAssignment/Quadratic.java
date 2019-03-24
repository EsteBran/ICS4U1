package FunctionAssignment;

public class Quadratic extends Function{
	
	double a, b, c;
	
	Quadratic(double a, double b, double c, double x1) {
		super(-25, 25);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double value(double x) {
		double value = a*(x-x1)*(x-x1) + b*(x-x1) + c;
		return value;
	}

	@Override
	public double derivative(double x) {
		double slope = 2*a*(x-x1) + b;
		return slope;
	}

}
