package system_of_geometric;


public class ResizeableTest {

	public static void main(String[] args) {
		Circle[] circles = new Circle[3];
		circles[0] = new Circle(2);
		circles[1] = new Circle(6);
		circles[2] = new Circle(3);
		Rectangle[] rects=new Rectangle[3]; 
		rects[0] = new Rectangle(2,3);
		rects[1] = new Rectangle(1,6);
		rects[2] = new Rectangle(5,7);
		Square[] squares=new Square[3]; 
		squares[0] = new Square(2);
		squares[1] = new Square(3);
		squares[2] = new Square(5);
		for (Circle circle : circles) {
			System.out.println("Before area circle: "+circle.getArea());
			System.out.print("After area circle: ");
			circle.resize(Math.random());
		}
		for (Rectangle rect : rects) {
			System.out.println("Before area rectangle: "+rect.getArea());
			System.out.print("After area rectangle: ");
			rect.resize(Math.random());
		}
		for (Rectangle square : squares) {
			System.out.println("Before area rectangle: "+square.getArea());
			System.out.print("After area rectangle: ");
			square.resize(Math.random());
		}
	}

}
