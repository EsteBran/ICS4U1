package oopExercises;
//Tawseef Hanif
//Mr. Radulovic
//February 28, 2019
//Fraction Class: allows for basic representation of 
//fractions with some arithmetic

public class Fraction {
	
	
	private int numerator;
	private int denominator;
	
	public Fraction (int a, int b) {
		numerator = a;
		denominator = b;
	}
	
	public void setNumerator(int a) {
		numerator = a;
	}
	
	public void setDenominator(int b) {
		if (b > 0) {
			denominator = b;
		}else if (b < 0) {
			numerator = -numerator;
			denominator = -denominator;
		}else if (b == 0){
			System.out.print("invalid denominator!");
		}
	}
	
	public Fraction mul(int n) {
		Fraction product = new Fraction(numerator, denominator);
		product.numerator *= n;
		return product;
		
	}
	
	public Fraction divide (int b) {
		Fraction quotient = new Fraction(numerator, denominator);
		denominator *= b;
		return quotient;
		
	}
	
	public Fraction add(Fraction b) {
		Fraction sum = new Fraction(numerator, denominator);
		int c = b.numerator;
		int d = b.denominator;
		
		numerator = numerator*d + denominator*c;
		denominator *= d;
		
		return sum;	
	}
	
	public Fraction sub(Fraction b) {
		Fraction result = new Fraction(numerator, denominator);
		int c = b.numerator;
		int d = b.denominator;
		
		numerator = numerator*d - denominator*c;
		denominator *= d;
		
		return result;
	}
	
	public String toString() {
		if (denominator != 0) {
			return numerator + "/" + denominator;
		}else {
			return "";
		}
	}
	

}
