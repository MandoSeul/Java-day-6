package ex02.defaultConstructor;
//default constructor / API 만드는 방법
public class MainEntry {
	/**
	 * @param args 메인은 아무 값도 넘겨 받지 않습니다.
	 * @param x 곱을 구하는 값에 첫번재 정수형 변수
	 * @param y 곱을 구하는 값에 두번째 정수형 변수
	 * @param mul 변수는 x와 y의  두 정수의 곱 저장 변수
	 */
	public static void main(String[] args) {
		int x=5,y=10,mul;
		char ch = 'a';
		String str="Hello Java";
		
		mul = mul(x,y);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(x+"*"+y+"="+mul);
		}

	public static int mul(int x,int y) {
		// TODO Auto-generated method stub
		return x*y;
	}
}
