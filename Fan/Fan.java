package Fan;

public class Fan {
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;
	private int speed = this.SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";

	public Fan() {
		super();
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSLOW() {
		return SLOW;
	}

	public int getMEDIUM() {
		return MEDIUM;
	}

	public int getFAST() {
		return FAST;
	}

	public Fan(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public String toString() {
		if (this.on)
			return "Fan [ speed=" + speed + ", radius=" + radius + ", color=" + color + "]" + " is on";

		return "Fan [ speed=" + speed + ", radius=" + radius + ", color=" + color + "]" + " is off";
	}

}
