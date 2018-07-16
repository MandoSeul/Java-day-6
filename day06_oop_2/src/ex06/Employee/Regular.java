package ex06.Employee;


public class Regular extends Employee_basic {
	protected int pay;
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public void Reg_input(int pay) {
		System.out.println();
		super.input(name, dept, pos, phone);
		System.out.print(" ±Þ¿© : "+pay);
		this.pay = pay;
		// TODO Auto-generated constructor stub
	}

}
