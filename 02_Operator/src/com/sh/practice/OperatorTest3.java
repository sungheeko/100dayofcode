package com.sh.practice;

import java.util.Scanner;

public class OperatorTest3 {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		
		System.out.print("��������: ");
		int kor = sc.nextInt();
		System.out.print("��������: ");
		int eng = sc.nextInt();
		System.out.print("��������: ");
		int math = sc.nextInt();
		System.out.print("��ǻ������: ");
		int com = sc.nextInt();
		
		int sum = kor + eng + math + com;
		int avg = sum / 4;
		
		System.out.println(sum);
		System.out.println(avg);
		
	}

	
	public void test2() {
		
		System.out.print("������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		int b = sc.nextInt();
		
		int result1 = a / b;
		int result2 = a % b;
		
		System.out.println(a + " / " + b + " = " + result1 
							+ "..." + result2);
	}
	
	public void test3() {
		
		System.out.print("���α��� : ");
		int width = sc.nextInt();
		System.out.print("���α��� : ");
		int height = sc.nextInt();
		
		int width2 = width + 5;
		int height2 = height * 2;
		
		System.out.println(width2++);
		System.out.println(height2);
		System.out.println(width2 * height2);
		
	}
	
	public void test4() {
		
		System.out.print("������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		int a = ++num1;
		int b = num2--;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a++);
		System.out.println(--b);
		
	}
	
	public void test5() {
		
		System.out.print("�μ��� Ű�� �Է��ϼ��� : ");
		int height1 = sc.nextInt();
		System.out.print("�μ��� �����Ը� �Է��ϼ��� : ");
		int weight1 = sc.nextInt();
		System.out.print("�⿵���� Ű�� �Է��ϼ��� : ");
		int height2 = sc.nextInt();
		System.out.print("�⿵���� �����Ը� �Է��ϼ��� : ");
		int weight2 = sc.nextInt();
		
		boolean result = height1 > height2 && weight1 > weight2 ? true : false;
		System.out.println(result);
		
		
	}

}
