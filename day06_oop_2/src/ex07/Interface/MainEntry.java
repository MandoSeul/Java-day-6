package ex07.Interface;

import ex05.Abstract_2.Shape;

interface A{ //interface�� abstact�� final�� ���� �� ����.
	int x = 90 ; //final int x =90;
	final int y = 76; // final�� �پ� �ִ� �������� �׻� �ʱ�ȭ�� �ʿ�.
	
	public void show(); // abstract �����ص� �ᱹ �߻�method�̴�.
	public abstract void disp();
}

interface B{
	void view();
}

interface C{
	String name = "happy";
	public void draw();
}
interface D extends B{ // interface���� ��ӿ����� extends Ű���� ���
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
