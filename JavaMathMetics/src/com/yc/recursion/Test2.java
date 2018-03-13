package com.yc.recursion;

public class Test2 {

	/**
	 * 
	 * 打印消息n次
	 */
	public static void main(String[] args) {
		print("hello",3);
	}
	
	public static void print(String context,int times){
		if(times>=1){
			System.out.println(context);
			print(context,times-1);
		}
	}
}
