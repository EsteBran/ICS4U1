package FunctionAssignment;

// Tawseef Hanif
// Mr. Radulovic
// March 25, 2018
// Arc Class : Subclass of the Function class. This class defines an arc function
// with center at (xcenter, ycenter) and radius r.

public class Arc extends Function{
	
	private double r, xcenter, ycenter;
	private String s;
	
	public Arc(double r, double xcenter, double ycenter) {
		super(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
		this.r = r;
		this.xcenter = xcenter;
		this.ycenter = ycenter;
	}

	@Override
	public double value(double x) {
		double value = Math.sqrt(r*r-(x-xcenter)*(x-xcenter)) + ycenter;
		if (undefined(value) == false) {
			return value; } else {return Double.NaN;}
	}

	@Override
	public double derivative(double x) {
		double slope = (x-xcenter) / Math.sqrt(r*r - (x-xcenter)*(x-xcenter));
		if (undefined(slope) == false) {
			return slope; } else {return Double.NaN;}
	}

	@Override
	public String toString() {
		s = "y = (" + r*r + " - (x - " + xcenter + ")^2)^0.5 + " +"(" + 
				+ ycenter + ")";
		return s;
	}

}
