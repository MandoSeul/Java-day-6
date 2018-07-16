package ex06.Employee;

public class MainEntry {
	public static void main(String[] args) {
		Employee_basic emp = new Employee_basic();
		emp = new Regular();
		emp = new Sales();
		
		emp.input("seul", "com", "사원 ", "010-5000-0000");
		((Regular) emp).Reg_input(400000);
		((Sales) emp).Sales_output();
		System.out.println();
		Temp temp = new Temp();
		temp.input("kim", "system", "알바", "0106454845");
		temp.temp_output();
		
	
	}
	}
