package ex01.This;

public class Point {
	protected int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public Point() {
		this(2,5); // 반드시 첫줄에 위치해야함
		System.out.println("hihi");
	}

	public Point(int x, int y){
		System.out.println("oh yeah");
		this.x=x;
		this.y=y;
	}
	public Point(int x){
		this(x,876);
	}
	public void disp(){
		System.out.println(x+","+y);
	}
}
