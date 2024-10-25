package com.tns.ifet.daytow;

public class NestedIfElse {

	public static void main(String[] args) {
		int a=10, b=20, c=30;
		if(a>c) {
			if(a>b) {
				System.out.println("The largest no. is "+a);
			}else {
				System.out.println("The largest no. is "+c);
			}
		}else {
			if(c>b) {
				System.out.println("The latgest no. is "+c);
			}else {
				System.out.println("The largest no. is "+b);
			}
		}

	}

}
  