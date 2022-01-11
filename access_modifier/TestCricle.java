package access_modifier;

public class TestCricle {

	public static void main(String[] args) {
		Circle cr1=new Circle();
		Circle cr2=new Circle(5);
		System.out.println("Circle1: "+cr1.getRadius()+" area: "+cr1.getArea());
		System.out.println("Circle2: "+cr2.getRadius()+" area: "+cr2.getArea());
		

	}

}
