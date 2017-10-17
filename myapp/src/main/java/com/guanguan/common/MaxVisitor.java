package com.guanguan.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxVisitor {
	//给出访客来访时间与离开时间[“10 14”,“12 14”,“8 9”,“8 11”,“14 17”],
	//每个字符串中第一个数字表示来访时间，第二个数字表示离开时间（客人已不在），计算24小时内各个时刻的最大访客量。
	public static void main(String[] args) throws IOException {
		System.out.println("访客的来访时间与离开时间如下：");
		String visitTime[]={"0 1","0 2","1 2","1 3","0 7","0 9"};
		ArrayList list = new ArrayList();
		for(int i=0;i<visitTime.length;i++){
			System.out.println(visitTime[i]);
			list.add(visitTime[i]);
		}
		int[] x = new int[list.size()];
		int[] y = new int[list.size()];
		for (int i = 0; i < x.length; i++) {
			String input = (String) list.get(i);
			String[] strs = input.split(" ");
			x[i] = Integer.parseInt(strs[0]);
			y[i] = Integer.parseInt(strs[1]);
		}
		Arrays.sort(x);
		Arrays.sort(y);
		for (int time = 0; time < 25; time++) {
			System.out.println(time + " 时的最大访客数：" + maxGuest(x, y, time));
		}
	}
	
	public static int maxGuest(int[] x, int[] y, int time) {
		int number = 0;
		//No.1
		//开始写代码，给出访客的来访时间与离开时间，计算某时刻的最大访客量，补充完整maxGuest方法
		for(int i = 0; i < x.length; i++){
			if(time<y[i]){
				number++;
			}
			if(time<x[i]&&number>0){
				number--;
			}
		} 
		//end_code
		return number;
	}
}
