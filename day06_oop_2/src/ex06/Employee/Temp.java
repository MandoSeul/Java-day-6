package ex06.Employee;

import java.io.InputStream;
import java.util.Scanner;

public class Temp extends Employee_basic {
	int pay = 0;
	
	public void temp_pay(){
		String temp;
		char y;
		int day=0, time = 0,ppay=8500;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ӽ����Դϱ�? (y/n)");
		temp= sc.next();
		y=temp.charAt(0);
		if(y=='y'){
			System.out.println("�ϼ��� �Է��Ͻÿ� : ");
			day = sc.nextInt();
			System.out.println("�ð��� �Է��ϼ��� : ");
			time = sc.nextInt();
		pay = day*time*ppay;
		}
		else if(y=='n'){
			System.out.println("�ӽ����� �̳��ϴ� . regular or sales ������ Ȯ���ϼ���.");
		}
		else
			System.out.println("error");
		
		
	}

	public void temp_output() {
	//	pay = 30*8500*10;
		System.out.println();
		 temp_pay();
	//	super.input(name, dept, pos, phone);
		System.out.print(" �ӽ����� ����� �Ѵ� ���� : "+pay);
		// TODO Auto-generated constructor stub
	}

}
