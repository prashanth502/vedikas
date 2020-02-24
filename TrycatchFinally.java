package com.suntechno;

public class TrycatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("java");
		System.out.println("java");
		String a=null;
		try {
		System.out.println(a.length());
		}
		catch(ArithmeticException e) {
			System.out.println("52");
		}
		finally {
			System.out.println("placed on important code");
		}
	
	

	}

}
