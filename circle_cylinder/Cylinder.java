package circle_cylinder;

public class Cylinder extends Circle {
	private double height;
    public double getVolum() {
        return super.getArea()*height;
    }
	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", getVolum()=" + getVolum() + ", getRadius()=" + getRadius()
				+ ", getColor()=" + getColor() + ", getArea()=" + getArea() + "]";
	}
	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}

}
