package com.guanguan.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

public class LoutiTest {
	public static void print(List list) {
		for (int i = 0; i < list.size(); i++) {
			String title = (String) list.get(i);
			System.out.println("第" + (i + 1) + "种走法：" + title);
		}
	}
	//一个共有10个台阶的楼梯，从下面走到上面，一次只能迈一个台阶或两个台阶，并且不能后退，走完这个楼梯共有多少种方法？并且分别输出每种走法。
	public static ArrayList addPre(List list, int num) {
		ArrayList arraylist = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			String title = (String) list.get(i);
			title  = num + title;
			arraylist.add(title);
		}
		return arraylist;
	}

	public static void main(String[] args) {
		int way1 = 1, way2 = 2, way3 = 0;

		String step1 = "1";//1个台阶走法
		String step2 = "11";//2个台阶走法
		String step3 = "2";

		List wayList1 = new ArrayList();//保存走法
		wayList1.add(step1);
		List wayList2 = new ArrayList();//保存走法
		wayList2.add(step2);
		wayList2.add(step3);

		List temp1, temp2;//临时保存走法
		List wayList = new ArrayList();//保存走法
		//No.1
		//开始写代码，补充完整for循环，求出走台阶的所有走法并输出
		//for 
		//end_code
		System.out.println("走法总共有：" + way3 + "种");
		System.out.println("走法如下：");
		print(wayList);
	}
}
