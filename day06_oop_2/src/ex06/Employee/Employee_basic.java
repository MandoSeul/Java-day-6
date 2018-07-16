package ex06.Employee;

public class Employee_basic {
	protected String name, dept, pos, phone;
	
	public void input(String name, String dept, String pos, String phone){
		this.name = name; this.dept=dept; this.pos=pos; this.phone=phone;
		System.out.print("이름 : "+name+" 직위 : "+pos+" 부서 : "+dept+" 번호 : "+phone);
	}
	public String getName() {
		return name;
	}

}
