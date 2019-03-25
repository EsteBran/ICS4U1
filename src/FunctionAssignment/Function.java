package FunctionAssignment;

public abstract class Function {
	
	protected double x1;
	protected double x2;
	int colour;
	String name;
	
	
	public Function(double x1, double x2) {
		this.x1 = x1;
		this.x2 = x2;
	}
	
	public abstract double value(double x);
	
	public abstract double derivative(double x);
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String toString();
	
	public void setDomain(double x1, double x2) {
		if (x2 > x1) {
			this.x2 = x2;
			this.x1 = x1;
			} else {System.out.println("please make x2 bigger than x1");
		}
	}
	
	public double getStartDomain() {
		return x1;
	}
	
	public double getEndDomain() {
		return x2;
	}
	
	public boolean undefined(double x2) {
		if (x2 == Double.POSITIVE_INFINITY || x2 == Double.NEGATIVE_INFINITY || x2 == Double.NaN ) {
			return true;
		} else {return false;}
	}
	
	public void setColour(int colour) {
		this.colour = colour;
	}
	
	public int getColour() {
		return colour;
	}
	
	
	
}

