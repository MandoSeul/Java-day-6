package ex05.Abstract_2;

public class MainEntry {
	//1. ������ class�� ��ü ������ ����
	public static void main(String[] args) {
		
		Circle cir = new Circle();
		cir.show("circle");
		
		new Circle().show("circle");
		new Rectangle().show("Rectangle");
		new Triangle().show("Triangle");
		

		//2. shape �θ� �߻� Ŭ������ �̿��ؼ� ��ü ����
		
		Shape sh = new Circle();
		sh = new Rectangle();
		sh.show("REc");
		
		//3.
		Shape [] ss = new Shape[3]; // �迭 ���� �� ����
		//Shape ss2 = new Shape(); // ��ü������ ��ü ������ �� ����.
		ss[0] = new Circle();
		ss[1] = new Rectangle();
		ss[2] = new Triangle();
		String[] name = {"Circle","Rectangle","Triangle"};
		for(int i=0; i<ss.length;i++){
			ss[i].show(name[i]);
		}
	}
	
}
