package QuadraticEquation;

public class QuadraticEquation {
	private double a,b,c;
	public QuadraticEquation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}



	public double getC() {
		return c;
	}
	public double getDiscriminant() {
		return this.b*this.b-4*this.a*this.c;
	}
	public double getRoot1() {
		return (-b+Math.sqrt(getDiscriminant()))/2*a;
	}
	public double getRoot2() {
		return (-b-Math.sqrt(getDiscriminant()))/2*a;
	}

}
