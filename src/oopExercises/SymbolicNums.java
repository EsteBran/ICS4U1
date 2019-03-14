package oopExercises;

public class SymbolicNums {

	public static void main(String[] args) {
		Fraction a = new Fraction(1,1);
		Fraction b = new Fraction(1,1);
		
		//test cases
		a.setNumerator(3);
		a.setDenominator(5);
		a.mul(2);
		System.out.println(a.toString());
		
		a.setNumerator(3);
		a.setDenominator(4);
		a.mul(8);
		System.out.println(a.toString());
		
		a.setNumerator(3);
		a.setDenominator(5);
		a.divide(2);
		System.out.println(a.toString());
		
		a.setNumerator(4);
		a.setDenominator(7);
		a.divide(2);
		System.out.println(a.toString());
		
		
		a.setNumerator(1);
		a.setDenominator(3);
		a.add(a);
		System.out.println(a.toString());
		
		a.setNumerator(1);
		a.setDenominator(8);
		b.setNumerator(3);
		b.setDenominator(4);
		a.add(b);
		System.out.println(a.toString());
		
		a.setNumerator(1);
		a.setDenominator(2);
		b.setNumerator(1);
		b.setDenominator(3);
		a.add(b);
		System.out.println(a.toString());
		
		a.setNumerator(3);
		a.setDenominator(4);
		b.setNumerator(1);
		b.setDenominator(4);
		a.sub(b);
		System.out.println(a.toString());
		
		a.setNumerator(3);
		a.setDenominator(4);
		b.setNumerator(2);
		b.setDenominator(3);
		a.sub(b);
		System.out.println(a.toString());
		
		
		
		

	}

}
