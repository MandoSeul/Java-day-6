package ex05.Abstract_2;

public class Circle extends Shape {

	@Override
	public double cal(double x) {
		// TODO Auto-generated method stub
		
		return x*x*Math.PI;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		System.out.println("크기는 : " + cal(5.4) + "이고 도형은 : " + name +"입니다.");
	}

}
