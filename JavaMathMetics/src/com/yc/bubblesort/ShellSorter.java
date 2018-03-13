package com.yc.bubblesort;

public class ShellSorter {
	public void sort(int[] a){
		int i,j;
		int r,temp;
		//r就是增量
		for(r=a.length/2;r>=1;r/=2){
			for(i=r;i<a.length;i++){
				temp=a[i];
				j=i-r;
				while(j>=0 && temp<a[j]){
					a[j+r]=a[j];
					j-=r;
				}
				a[j+r]=temp;
			}
		}
	}
}
