package com.hdfc.datatype;

public class RefDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Naresh");
		
		String s2= new String("Naresh");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
		
		RefDataTypes r1 = new RefDataTypes();
		System.out.println(r1);

	}

}
