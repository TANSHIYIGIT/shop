package com.yc.bubblesort;

public class SelectionSort {
	public void sort(int[] a){
		int minindex=0;
		int temp=0;
		for(int i=0;i<a.length;i++){
			minindex=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[minindex]){
					minindex=j;
				}
			}
			temp=a[i];
			a[i]=a[minindex];
			a[minindex]=temp;
		}
	}
}
