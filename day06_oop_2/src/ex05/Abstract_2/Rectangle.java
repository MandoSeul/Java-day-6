package ex05.Abstract_2;

public class Rectangle extends Shape {

	@Override
	public double cal(double x) {
		// TODO Auto-generated method stub
		double w = 10;
		return w*x;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		System.out.println("ũ��� : " + cal(5.4) + "�̰� ������ : " + name +"�Դϴ�.");
	}

}
