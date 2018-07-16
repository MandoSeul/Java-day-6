package ex09.interface_3;

import java.util.Scanner;

public class Plane implements Trans {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		int min=0;
		double fast=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("비행기가 몇분동안 움직였습니까? ");
		min=sc.nextInt();
		fast = min*accelerater;
		System.out.println("비행기의 속도는  : " + fast+" 입니다.");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("바아아아아앙하면서 멈췄다.");
	}
	public Plane(){
		move();
		stop();
	}

}
