package FunctionAssignment;

public class Logarithm extends Function{
	
	double a, b, x1;
	
	Logarithm(double a, double b, double x1){
		super(-25, 25);
		this.a = a;
		this.b = b;
		this.x1 = x1;
	}

	@Override
	public double value(double x) {
		double value = a*Math.log(x-x1) + b;
		return value;
	}

	@Override
	public double derivative(double x) {
		double slope = a / (x-x1) ; 
		return slope;
	}

}
