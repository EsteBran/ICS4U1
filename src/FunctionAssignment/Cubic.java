package FunctionAssignment;

public class Cubic extends Function{
	
	private double a, b, c, d, x1;

	Cubic(double a, double b, double c, double d, double x1) {
			super(-25, 25);
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.x1 = x1;
		}

	@Override
	public double value(double x) {
		double value = a*x*x*x + b*x*x + c*x + d;
		return value;
	}

	@Override
	public double derivative(double x) {
		double slope = 3*a*(x-x1)*(x-x1) + 2*b*(x-x1) + c;
		return slope;
	}
}
