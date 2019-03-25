package FunctionAssignment;

public class FunctionTester {
	
	public static void main(String[] args) {
		
		Parabola p = new Parabola(1.0, 0.0,0.0);
		Linear l = new Linear(1.0 , 1.0, 0.0);
		Arc a = new Arc(4.0, 0.0, -2.0);
		Quadratic q = new Quadratic(0.25, -0.5, -1.0, 0.0);
		Cubic c = new Cubic(0.35, 0.25, -0.5, -1.0, 2.0);
		Logarithm log = new Logarithm(1.0, 0.0, 0.0);
		
		System.out.println(a.toString());
		System.out.println(a.derivative(5.0));
		System.out.println(a.value(4.0));
		System.out.println("");
		
		System.out.println(l.toString());
		System.out.println(l.derivative(2.0));
		System.out.println(l.value(4.0));
	}

}
