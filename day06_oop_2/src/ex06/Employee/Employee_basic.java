package ex06.Employee;

public class Employee_basic {
	protected String name, dept, pos, phone;
	
	public void input(String name, String dept, String pos, String phone){
		this.name = name; this.dept=dept; this.pos=pos; this.phone=phone;
		System.out.print("�̸� : "+name+" ���� : "+pos+" �μ� : "+dept+" ��ȣ : "+phone);
	}
	public String getName() {
		return name;
	}

}
