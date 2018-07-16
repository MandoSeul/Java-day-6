package ex07.Interface;

import ex05.Abstract_2.Shape;

interface A{ //interface는 abstact와 final만 가질 수 있음.
	int x = 90 ; //final int x =90;
	final int y = 76; // final이 붙어 있는 변수들은 항상 초기화가 필요.
	
	public void show(); // abstract 생략해도 결국 추상method이다.
	public abstract void disp();
}

interface B{
	void view();
}

interface C{
	String name = "happy";
	public void draw();
}
interface D extends B{ // interface간에 상속에서도 extends 키워드 사용
	void view();
}

class Rect implements C{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("  ");
	}
	
}

class Multi extends Shape implements B,C,A {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double cal(double x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MainEntry {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.draw();
		C cc = new Rect();
		cc.draw();
	}
}
