package ex05.Abstract_2;

public class MainEntry {
	//1. 각자의 class로 객체 생성한 형태
	public static void main(String[] args) {
		
		Circle cir = new Circle();
		cir.show("circle");
		
		new Circle().show("circle");
		new Rectangle().show("Rectangle");
		new Triangle().show("Triangle");
		

		//2. shape 부모 추상 클래스를 이용해서 객체 생성
		
		Shape sh = new Circle();
		sh = new Rectangle();
		sh.show("REc");
		
		//3.
		Shape [] ss = new Shape[3]; // 배열 선언 및 생성
		//Shape ss2 = new Shape(); // 자체적으로 객체 생성할 수 없음.
		ss[0] = new Circle();
		ss[1] = new Rectangle();
		ss[2] = new Triangle();
		String[] name = {"Circle","Rectangle","Triangle"};
		for(int i=0; i<ss.length;i++){
			ss[i].show(name[i]);
		}
	}
	
}
