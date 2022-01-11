package QuadraticEquation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextDouble();
		System.out.println("Enter b:");
		b=sc.nextDouble();
		System.out.println("Enter c:");
		c=sc.nextDouble();
		QuadraticEquation QE=new QuadraticEquation(a,b,c);
		if(QE.getDiscriminant()>0) {
			System.out.println("r1: "+QE.getRoot1());
			System.out.println("r2: "+QE.getRoot2());
		}
		else if(QE.getDiscriminant()==0) {
			System.out.println("r1: "+QE.getRoot1());
		}
		else {
			System.out.println("The equation has no roots");
		}

	}

}
