package MoveablePoint;

public class MoveablePoint extends Point {
	private float xSpeed=0.0f;
	private float ySpeed=0.0f;
	public MoveablePoint() {
		super();
	}
	public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MoveablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getySpeed() {
		return ySpeed;
	}
	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	public void setSpeed(float xSpeed,float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed =ySpeed;
	}
	public float[] getSpeed() {
		float a[]=new float[2];
		a[0]=xSpeed;
		a[1]=ySpeed;
		return a;
	}
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + "),speed=("+xSpeed+", "+ySpeed+")";
	}
	public MoveablePoint move() {
		float x=super.getX();
		float y=super.getY();
		super.setX(x+=xSpeed);
		super.setY(y+=ySpeed);
		return this;
	}
	

}
