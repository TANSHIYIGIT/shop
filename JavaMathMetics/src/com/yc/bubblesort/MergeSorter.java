package com.yc.bubblesort;

public class MergeSorter {
	
	
	public void sort(int[] a){
		if(a.length<=1){
			return;
		}
		int [] first=new int[a.length/2];
		int [] second=new int[a.length -first.length];
		//将a对应的元素复制到first及second
		System.arraycopy(a, 0, first, 0, first.length);
		System.arraycopy(a, first.length, second, 0, second.length);
		MergeSorter firstSorter=new MergeSorter();
		MergeSorter secondSorter=new MergeSorter();
		firstSorter.sort(first);
		secondSorter.sort(second);
		merge(first, second);
	}
	
	private int [] merge(int [] first,int[] second){
		int [] a=new int[first.length+second.length];
		int iFirst=0;
		int iSecond=0;
		int ia=0;
		
		while(iFirst<first.length && iSecond<second.length){
			if(first[iFirst]>second[iSecond]){
				a[ia]=first[iFirst];
				iFirst++;
			}else{
				a[ia]=second[iSecond];
				iSecond++;
			}
			ia++;
		}
		//将first中剩下的元素复制到a中
		System.arraycopy(first, iFirst, a, ia, first.length-iFirst);
		//将second中剩下的元素复制到a中
		System.arraycopy(second, iSecond, a, ia, second.length-iSecond);
		return a;
	}
}
