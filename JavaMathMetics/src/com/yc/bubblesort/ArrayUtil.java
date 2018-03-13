package com.yc.bubblesort;

import java.util.Random;

public class ArrayUtil {
	private static Random rand=new Random();
	
	public static int[] getIntArray(int length,int n){
		int[] a=new int[length];
		for(int i=0;i<length;i++){
			a[i]=rand.nextInt(n);
		}
		return a;
	}
	
	/*
	 * 打印输出
	 */
	public static void print(int [] a){
		for(int i=0;i<a.length;i++){
			if(i%10==0){
				System.out.println();
			}
			System.out.print(a[i]+"\t");
		}
	}
}
