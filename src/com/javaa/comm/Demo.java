package com.javaa.comm;

public class Demo {
//user defined exception
	public static void age(int age) throws MyException {
		if (age <= 18) {
			System.out.println("yes");
		} else {
			throw new MyException("test");
		}

	}

	public static void votingage(int age) throws MyException {
		if (age >= 18) {
			System.out.println("yes");
		} else {
			throw new MyException("you are not eligible");
		}

	}

	public static void main(String[] args) throws Throwable {
		age(122);
		votingage(1);
	}

}
