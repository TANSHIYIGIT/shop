package com.yc.bubblesort;

public class StopWatch {
	private long runningTime;//所运行的时间
	private long startTime;
	private boolean isRunning;//是否正在运行
	
	public StopWatch(){
		reset();
	}
	
	public void start(){
		if(isRunning){
			return;
		}
		isRunning=true;
		startTime=System.currentTimeMillis();
	}
	
	public void stop(){
		if(!isRunning){
			return;
		}
		isRunning=false;
		long endTime=System.currentTimeMillis();
		runningTime=runningTime+endTime-startTime;
	}
	
	/*
	 * 返回总的流逝时间
	 */
	public long getRunningTime(){
		if(isRunning){
			long endTime=System.currentTimeMillis();
			return runningTime+endTime-startTime;
		}else{
			return runningTime;
		}
	}
	
	//重置秒表
	private void reset() {
		runningTime=0;
		isRunning=false;
	}
}
