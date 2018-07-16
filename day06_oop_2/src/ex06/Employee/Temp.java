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
		System.out.println("임시직입니까? (y/n)");
		temp= sc.next();
		y=temp.charAt(0);
		if(y=='y'){
			System.out.println("일수를 입력하시오 : ");
			day = sc.nextInt();
			System.out.println("시간을 입력하세요 : ");
			time = sc.nextInt();
		pay = day*time*ppay;
		}
		else if(y=='n'){
			System.out.println("임시직이 이납니다 . regular or sales 월급을 확인하세요.");
		}
		else
			System.out.println("error");
		
		
	}

	public void temp_output() {
	//	pay = 30*8500*10;
		System.out.println();
		 temp_pay();
	//	super.input(name, dept, pos, phone);
		System.out.print(" 임시직일 경우의 한달 월급 : "+pay);
		// TODO Auto-generated constructor stub
	}

}
