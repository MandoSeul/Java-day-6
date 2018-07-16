package ex04.Abstract;


abstract class Shape{ // 추상클래스, super class
	double result = 0;
	public abstract double cal(); // 추상메소드
	public abstract void draw();
	public void show(){ // 일반 메소드
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
		System.out.println("원의 넓이 : " + result + "인 원을 그렸습니다.");
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
		System.out.println("사각형의 넓이 : " + cal() + "인 원을 그렸습니다.");
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
		System.out.println("삼각형의 넓이 : " + cal() + "인 원을 그렸습니다.");
	}
	
}
public class MainEntry {
	public static void main(String[] args){
		//shape s = new sahpe(); 자체적으로 생성할 수 없다. 추상 클래스
		Shape cir= new Circle();//나를 상속받은 자손으로 객체 성성 가능
		Shape rec = new Rectangle();
		Shape tri = new Triangle();
		cir.draw();
		rec.draw();
		tri.draw();
	}
}
