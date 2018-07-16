package ex09.interface_3;

import java.util.Scanner;

public class Bus implements Trans {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		int min=0;
		double fast=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("버스가 몇분동안 움직였습니까? ");
		min=sc.nextInt();
		fast = min*accelerater;
		System.out.println("Bus의 속도는  : " + fast+" 입니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("끼이이익하면서 멈췄다.");
	}
	public Bus(){
		move();
		stop();
	}
}
