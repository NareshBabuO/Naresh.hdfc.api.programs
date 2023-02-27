package com.hdfc.myapps.program;

public class OperatorsDemo {

	public static void main(String[] args) {

		int i=0;
		
		if (i ==0 ) {
			
			i++;
			System.out.println(i);
			
			
			int salary=0;
			salary +=100;
			System.out.println(salary);
			
			
			System.out.println("Logical Op");
			
			int num1=50;
			int num2=100;
			int max=0;
			
			max =(num1 > num2) ? num1 : num2;
			
			System.out.println(max);
			
			
			int result = 5+3 - 2*2 + 1;
			System.out.println(result);
			
		
		}
		
	}

}
