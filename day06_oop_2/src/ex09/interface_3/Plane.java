package ex09.interface_3;

import java.util.Scanner;

public class Plane implements Trans {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		int min=0;
		double fast=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("����Ⱑ ��е��� ���������ϱ�? ");
		min=sc.nextInt();
		fast = min*accelerater;
		System.out.println("������� �ӵ���  : " + fast+" �Դϴ�.");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�پƾƾƾƾ��ϸ鼭 �����.");
	}
	public Plane(){
		move();
		stop();
	}

}
