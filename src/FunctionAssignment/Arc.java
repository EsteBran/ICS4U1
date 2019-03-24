package FunctionAssignment;

public class Arc extends Function{
	
	double r, xcenter, ycenter;
	
	public Arc(double r, double xcenter, double ycenter) {
	super(-25, 25);
	this.r = r;
	this.xcenter = xcenter;
	this.ycenter = ycenter;
	}

	@Override
	public double value(double x) {
		double value = Math.sqrt(r*r-(x-xcenter)*(x-xcenter)) + ycenter;
		return value;
	}

	@Override
	public double derivative(double x) {
		double slope = (x-xcenter)*(1 / Math.sqrt((x-xcenter)*(x-xcenter)-r*r));
		return slope	;
	}

}
