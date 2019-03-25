package FunctionAssignment;

public class Parabola extends Function{
	
	double a,b, x1;
	
	Parabola(double a, double b, double x1) {
		super(-25, 25);
		this.a = a;
		this.b = b;
		this.x1 = x1;
	}

	@Override
	public double value(double x) {
		double value = a*(x-x1)*(x-x1) + b;
		return value;
	}

	@Override
	public double derivative(double x) {
		double slope = 2*a*(x-x1);
		return slope;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
