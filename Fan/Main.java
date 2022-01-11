package Fan;

public class Main {

	public static void main(String[] args) {
		Fan f1= new Fan();
		Fan f2= new Fan();
		f1.setSpeed(f1.getFAST());
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setOn(true);
		f2.setSpeed(f2.getMEDIUM());
		System.out.println(f1.toString());;
		System.out.println(f2.toString());;

	}

}
