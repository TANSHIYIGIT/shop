package com.yc.bubblesort;

public class BubbleSort {
	public void bsort(int [] a){
		for(int i=1;i<a.length-1;i++){
			for(int j=i;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}
