package ex03.override;

public class Circle extends Point {
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public String toString() {
		return "Circle [r=" + r + ", x=" + getX() + ", y=" + getY() + "]";
	}

	public void display(){
		super.display();
		System.out.println(","+r);
	}
}
