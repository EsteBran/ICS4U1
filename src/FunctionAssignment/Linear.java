package FunctionAssignment;

public class Linear extends Function{
	
	private double m, b;
	
	Linear(double m, double b, double x1) {
		super(-25, 25);
		this.m = m;
		this.b = b;
		
	}
	

	@Override
	public double value(double x) {
		double value = m*x + b;
		return value;
	}

	@Override
	public double derivative(double x) {
		double slope = this.m; 
		return slope;
	}

}
