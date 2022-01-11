package access_modifier;

public class Circle {
	private double radius=1.0;
	private String color="red";
	public Circle() {
		super();
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	double getRadius() {
		return radius;
	}
	double getArea() {
		return radius*radius*3.14;
	}

}
