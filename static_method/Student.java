package static_method;

public class Student {
	private int rollno;
	private String name;
	private static String college = "ACBAZZ";

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	static void change() {
		college = "CODEGYM";
	}

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}