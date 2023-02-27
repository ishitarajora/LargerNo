package com.acts;

import java.util.Scanner;

public class LargerNo {

	public static void main(String[] args) {
		System.out.println("enter two nos");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number 1");
		int num1 = sc.nextInt();
		
		System.out.println("enter number 2");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is larger");
		}
		else {
			System.out.println(num2+ " is larger" );
		}
			
	}

}
