package ex06.Employee;

public class Sales extends Regular {

	public double cal_pay(){
		return super.getPay()*(1.5);
	}
	public void Sales_output() {
		System.out.println();
		super.Reg_input(super.getPay());
		System.out.print(" �������� ����� ���� : "+cal_pay());
		// TODO Auto-generated constructor stub
	}
}
