package ex08.Interface_2;

public class MainEntery {
	public static void main(String[] args) {
		//1. �ڱ��ڽ����� ��ü ����
		Main me = new Main();
		me.draw();
		System.out.println(me.num);
		
		// 2. �θ� �������̽��� ��ü ����
		IDraw meme = new Main();
		System.out.println(meme.num);
		meme.draw();
	}
}
