package com.sh.practice;

import java.util.Scanner;

public class B_Switch {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("������ �Է��ϼ��� : ");
		double score = sc.nextDouble();
		
		if(score > 0 && score <= 4.5) {
		
		switch((int)score) {
		case 1: if(score >= 4.0) System.out.println("scholarship"); break;
		case 2: if(score >= 3.0) System.out.println("next semestr"); break;
		case 3: if(score >= 2.0) System.out.println("seasonal semestr"); break;
		case 4: if(score < 2.0) System.out.println("retake"); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
		
		}
		}
	}
	
	public void practice2() {
		
		System.out.print("������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		int b = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		int c = sc.nextInt();
		
		int result = (a < b) && (a < c) ? a : b < c ? b : c;
		
		System.out.println(result);
		
	}
	
	public void practice3() {
		
		System.out.print("������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		int b = sc.nextInt();
		
		if(a >= b) {
			System.out.println(a - b);
		}
	}
	
	public void practice4() {
		
		System.out.print("������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		
		if(a == 0) {
			System.out.println("zero");
		}else if(a > 0){
			System.out.println("plus");
		}else {
			System.out.println("minus");
		}
		
	}
	
	public void practice5() {
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		
		int result = year % 400;
		
		if(result == 0) {
			System.out.println("leap year");
		}else if(result == 1) {
			System.out.println("common year");
		}
		
	}
	
	public void practice6() {
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: System.out.println("dog"); break;
		case 2: System.out.println("cat"); break;
		case 3: System.out.println("chick"); break;
		default : System.out.println("I don't know"); return;
		}
	}
	
	public void practice7() {
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		
		switch(year) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 10:
		case 12: System.out.println("31"); break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("30"); break;
		case 2: System.out.println("28"); break;
		default : System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); return;
			
		}
		
	}

}
