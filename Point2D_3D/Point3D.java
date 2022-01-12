package Point2D_3D;

import java.util.Arrays;

public class Point3D extends Point2D {
	private float z= 0.0f;

	public float getZ() {
		return z;
	}

	public Point3D() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point3D(float x, float y,float z) {
		super(x, y);
		this.z=z;
		// TODO Auto-generated constructor stub
	}

	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x,float y,float z) {
		super.setX(x);
		super.setY(y);
		this.z = z;
	}
	@Override
	public String toString() {
		return "("+super.getX()+", "+super.getY()+", "+z+")";
	}

	public float[] getXYZ() {
		float a[]=new float[3];
		a[0]=super.getX();
		a[1]=super.getY();
		a[2]=z;
		return a;
	}
	

}
