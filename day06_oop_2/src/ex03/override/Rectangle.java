package ex03.override;

public class Rectangle extends Point {

	int x2, y2;

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	@Override
	public String toString() {
		return "Rectangle [x2=" + x2 + ", y2=" + y2 + ", x=" + x + ", y=" + y + "]";
	}

	public void display(){
		super.display();
		System.out.println(","+x2+","+y2);
	}
}
