package com.yc.bubblesort;

public class InsertionSorter {
	public void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			//取出i的值，与数组中前面的元素的最后一个比较
			int next = a[i];
			int j = i;
			while (j > 0 && a[j - 1] > next) {
				a[j]=a[j-1];
				j--;
			}
			a[j]=next;
		}
	}
}
