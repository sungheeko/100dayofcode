package com.sh.practice;

public class PrintPractice1 {
	
	public void practice1() {
		// "����ģ�� ��������"�� �ι� ����ϱ�
		
		String[] str = new String[2];
		
	      for(int i=0; i<str.length; i++) {
	        System.out.println("����ģ�� ��������");
	        
	    }
	}

	public void practice2() {
		// ������ ���� ������ �ϰ� -100�� ����ϱ�
		
		int i = -100;
		System.out.println(i);
	}
	
	
	
	public void practice3() {
		
		System.out.println("Programming! " + "It's fun.");
		
	}
	
	public void practice4() {
		
		String name = "Hong Gil Dong";
		int age = 13;
		System.out.println("My name is " + name + ". " +
							"I am " + age + " years old");
	}
	
	public void practice5() {
		
		int height = 170;
		double weight = 68.6;
		
		System.out.printf("My height %d My weight %.6f ", height, weight);
	}
	
	public void practice6( ) { 
		// 5 * 2 = 10 ����ϱ�
		
		for(int dan=2; dan<=9; dan++){
			System.out.printf(" ----- %d ----- \n", dan);
				
			for(int su=1; su <= 9; su++) {
				System.out.printf("%d * %d = %d\n", dan, su, (dan * su));
			
			}
		}
		
	}
	
	public void Question7() {
		
		int kor = 90;
		int mat = 80;
		int eng = 100;
		int sum = 90 + 80 + 100;
		int avg = sum / 3;
		
		System.out.println(kor);
		System.out.println(mat);
		System.out.println(eng);
		System.out.println(sum);
		System.out.println(avg);
		
	}
}


