package com.sh.practice;

import java.util.Scanner;

public class A_If {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println(num);
		}else if(num < 0) {
			System.out.println(num);
			System.out.println("minus");
		}
		
	}
	
	public void practice2() {
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		int height = sc.nextInt();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		int weight = sc.nextInt();
		
		int result = weight + 100 - height;
		
		System.out.println(result);
		
		if(result > 0) {
			System.out.println("Obesity");
		}
		
	}
	
	public void practice3() {
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("adult");
		}else {
			System.out.println(age-- + "years later");
			
		}
		
	}
	
	public void practice4() {
		
		System.out.print("�����Ը� �Է��ϼ��� : ");
		double weight = sc.nextDouble();
		
		if(weight <= 50.80) {
			System.out.println("Flyweight");
		}else if(weight <= 61.23) {
			System.out.println("Lightweight");
		}else if(weight <= 72.57) {
			System.out.println("Middleweight");
		}else if(weight <= 88.45) {
			System.out.println("Cruiserweight");
		}else {
			System.out.print("Heavyweight");
		}
	}
	
	public void practice5() {
		
		System.out.print("�Ǽ��� �Է��ϼ��� : ");
		double d1 = sc.nextDouble();
		System.out.print("�Ǽ��� �Է��ϼ��� : ");
		double d2 = sc.nextDouble();
		
		if(d1 > 4.0 && d2 > 4.0) {
			System.out.println("A");
		}else if(d1 > 3.0 && d2 > 3.0) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
	}

}
