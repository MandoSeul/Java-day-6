package ex04.Abstract;


abstract class Shape{ // �߻�Ŭ����, super class
	double result = 0;
	public abstract double cal(); // �߻�޼ҵ�
	public abstract void draw();
	public void show(){ // �Ϲ� �޼ҵ�
		System.out.println("Super Class Shape");
	}
}
class Circle extends Shape{
	double r = 5.0;

	@Override
	public double cal() {
		// TODO Auto-generated method stub
		result = r*r*Math.PI;
		return result;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		cal();
		System.out.println("���� ���� : " + result + "�� ���� �׷Ƚ��ϴ�.");
	}
	
}

class Rectangle extends Shape{
	double w = 3, h=5;
	@Override
	public double cal() {
		// TODO Auto-generated method stub
		return w*h;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�簢���� ���� : " + cal() + "�� ���� �׷Ƚ��ϴ�.");
	}
	
}

class Triangle extends Shape{
	double w=7, h=8;
	@Override
	public double cal() {
		// TODO Auto-generated method stub
		
		return 0.5*w*h;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ���� ���� : " + cal() + "�� ���� �׷Ƚ��ϴ�.");
	}
	
}
public class MainEntry {
	public static void main(String[] args){
		//shape s = new sahpe(); ��ü������ ������ �� ����. �߻� Ŭ����
		Shape cir= new Circle();//���� ��ӹ��� �ڼ����� ��ü ���� ����
		Shape rec = new Rectangle();
		Shape tri = new Triangle();
		cir.draw();
		rec.draw();
		tri.draw();
	}
}
