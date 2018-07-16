package ex08.Interface_2;

public class MainEntery {
	public static void main(String[] args) {
		//1. 자기자신으로 객체 생성
		Main me = new Main();
		me.draw();
		System.out.println(me.num);
		
		// 2. 부모 인터페이스로 객체 생성
		IDraw meme = new Main();
		System.out.println(meme.num);
		meme.draw();
	}
}
