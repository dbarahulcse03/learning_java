package com.desco.training;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is a First Class");
		
		int a=5, b=2, c=3;
		float d=++a/--b- --c/++a+b;
		System.out.println(d); 
		String x="10";
		int t= Integer.parseInt(x);
		System.out.println(t);
		Scanner input= new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		int o=input.nextInt();
		/*if(m>=n)
		{
			if(m>=o)
			{
				System.out.println(m);
			}
		}
		else {
				if(n>=m)
				 {
					if(n>=o)
					{
						System.out.println(n);
						
					}
					
				}
				else System.out.println(o);
		}*/
		
		switch (n) {
		case 1:
			System.out.println(n);
			break;

		default:
			System.out.println("Not Found");
			break;
		}
	}
}
