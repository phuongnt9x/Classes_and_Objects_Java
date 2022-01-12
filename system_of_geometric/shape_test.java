package system_of_geometric;

public class shape_test {
	public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]=new Square(2);
        shapes[1]=new Rectangle(2,3);
        shapes[2]= new Circle(3);
        int i=0;
        for(Shape shape:shapes) {
        	System.out.println("Area "+i+": "+shape.getArea());
        	if(shape instanceof Colorable) {
        		
        		((Colorable) shape).howToColor();
        	}
        	i++;
//        	if(shape instanceof Circle) {
//        		System.out.println( "Circle area: "+ ((Circle) shape).getArea());;
//        	}else if(shape instanceof Rectangle){
//        		System.out.println("Rectangle area: "+((Rectangle) shape).getArea());
//        	}else {
//        		System.out.println("Square area: "+((Square)shape).getArea());
//			}
        }
    }

}
