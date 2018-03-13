package com.yc.bubblesort;

public class Test {
	public static void main(String[] args) {
		ArrayUtil au=new ArrayUtil();
		int[] a=au.getIntArray(50, 100);
//		BubbleSort bubble=new BubbleSort();
//		bubble.bsort(a);
		
		SelectionSort ss=new SelectionSort();
		ss.sort(a);
		
//		InsertionSorter is=new InsertionSorter();
//		is.sort(a);
		
//		ShellSorter ss=new ShellSorter();
//		ss.sort(a);
		au.print(a);
	}
}
