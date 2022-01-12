package circle_cylinder;

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(3,"blue",5);
        System.out.println(cylinder);

        cylinder = new Cylinder(1,"green",5);
        System.out.println(cylinder);

        cylinder = new Cylinder(3,"red",6);
        System.out.println(cylinder);
        Circle cir=new Circle(5,"black");
        System.out.println(cir);

	}

}
