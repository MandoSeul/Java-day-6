package ex02.defaultConstructor;
//default constructor / API ����� ���
public class MainEntry {
	/**
	 * @param args ������ �ƹ� ���� �Ѱ� ���� �ʽ��ϴ�.
	 * @param x ���� ���ϴ� ���� ù���� ������ ����
	 * @param y ���� ���ϴ� ���� �ι�° ������ ����
	 * @param mul ������ x�� y��  �� ������ �� ���� ����
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
