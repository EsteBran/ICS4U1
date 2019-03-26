package FunctionAssignment;

// Tawseef Hanif
// Mr. Radulovic
// March 25, 2018
// Function tester class: instantiates the different function classes
// with varying parameters and tests them to check that the methods work
// and are outputting the correct values

public class FunctionTester {
	
	public static void main(String[] args) {
		
		Parabola p = new Parabola(1.0, 3.0,0.0);
		Linear l = new Linear(1.0 , 1.0, 0.0);
		Arc a = new Arc(4.0, 0.0, -2.0);
		Quadratic q = new Quadratic(0.25, -0.5, -1.0, 0.0);
		Cubic c = new Cubic(0.35, 0.25, -0.5, -1.0, 2.0);
		Logarithm ln = new Logarithm(1.0, 0.0, 0.0);
		
		System.out.println(a.toString());
		System.out.println(a.derivative(3.0));
		System.out.println(a.value(4.0));
		System.out.println("");
		
		System.out.println(l.toString());
		System.out.println(l.derivative(2.0));
		System.out.println(l.value(4.0));
		System.out.println("");

		System.out.println(c.toString());
		System.out.println(c.derivative(3.0));
		System.out.println(c.value(4.0));
		System.out.println("");

		System.out.println(ln.toString());
		System.out.println(ln.derivative(5.0));
		System.out.println(ln.value(40.0));
		System.out.println("");

		System.out.println(p.toString());
		System.out.println(p.derivative(5.0));
		System.out.println(p.value(40.0));
		System.out.println("");

		System.out.println(q.toString());
		System.out.println(q.derivative(5.0));
		System.out.println(q.value(40.0));
		System.out.println("");
	}

}
