package ar.edu.unq.poo2.tp0;

public class punto {
	
	private float x;
	private float y;
	
	
	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public punto(float x, float y) {
		super();
		this.setXY(x, y);
	}
}
