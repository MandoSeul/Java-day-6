package ex09.interface_3;

import java.util.Scanner;

public class Bus implements Trans {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		int min=0;
		double fast=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��е��� ���������ϱ�? ");
		min=sc.nextInt();
		fast = min*accelerater;
		System.out.println("Bus�� �ӵ���  : " + fast+" �Դϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("���������ϸ鼭 �����.");
	}
	public Bus(){
		move();
		stop();
	}
}
