package com.yc.recursion;

public class Test3 {
	/*
	 * 判断是否为回文
	 */
	public static void main(String[] args) {
		System.out.println(isHuiWen("aba"));
	}
	
	public static boolean isHuiWen(String s){
		if(s.length()<=1){
			return true;
		}else if(s.charAt(0)!=s.charAt(s.length()-1)){
			return false;
		}else{
			String news=s.substring(1, s.length()-1);
			return isHuiWen(news);
		}
	}
}
