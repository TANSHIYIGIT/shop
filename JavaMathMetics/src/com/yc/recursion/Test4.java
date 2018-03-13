package com.yc.recursion;

public class Test4 {
	public static void main(String[] args) {
		System.out.println(isHuiWen("abccba",0,6));
	}
	
	public static boolean isHuiWen(String s,int start,int end){
		if(start<=end){
			return true;
		}else if(s.charAt(start)!=s.charAt(end)){
			return false;
		}else{
			return isHuiWen(s,start+1,end-1);
		}
	}
}
