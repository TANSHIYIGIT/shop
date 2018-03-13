package com.yc.recursion;

import java.io.File;

/**
 * 求一个目录下所有的文件的大小
 * @author Administrator
 *
 */
public class Test5 {
	public static void main(String[] args) {
		File f=new File("D:\\API");
		System.out.println(getSize(f));
	}
	
	public static long getSize(File file){
		long size=0;
		if(file.isDirectory()){
			File[] fs=file.listFiles();
			if(fs!=null&&fs.length>0){
				for(File f:fs){
					size+=getSize(f);
				}
			}
		}else{
			size+=file.length();
		}
		return size;
	}
}
