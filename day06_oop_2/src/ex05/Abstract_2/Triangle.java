package ex05.Abstract_2;

public class Triangle extends Shape{

	@Override
	public double cal(double x) {
		double w = 10;
		// TODO Auto-generated method stub
		return x*w*0.5;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		System.out.println("ũ��� : " + cal(5.4) + "�̰� ������ : " + name +"�Դϴ�.");
	}

}
