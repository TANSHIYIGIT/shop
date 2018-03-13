package com.yc.recursion;

public class Test1 {
	public static void main(String[] args) {
		System.out.println(digui(4));
	}
	
	public static long digui(long num){
		if(num==1){
			return 1;
		}else{
			return num*digui(num-1);
		}
	}
}
