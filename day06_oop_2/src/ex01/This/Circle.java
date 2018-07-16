package ex01.This;

public class Circle extends Point {
	private int r;
	public Circle() {
		// TODO Auto-generated constructor stub
	System.out.println("sub constructor");
	}

	
	
	public Circle(int r) {
		
		super();
		this.r = r;
		System.out.println("hihi");
	}



	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void disp(){
		super.disp();
		System.out.println(","+r);
	}
}
