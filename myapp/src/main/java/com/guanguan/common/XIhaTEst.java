package com.guanguan.common;

import java.util.Stack;

public class XIhaTEst {
	
	public static String reverse6(String s) {
		  
		char[] str = s.toCharArray();

		int begin = 0;
		int end = s.length() - 1;

		while (begin < end) {
			str[begin] = (char) (str[begin] ^ str[end]);
			str[end] = (char) (str[begin] ^ str[end]);
			str[begin] = (char) (str[end] ^ str[begin]);
			begin++;
			end--;
		}
		return new String(str);
	}
	public static String reverse7(String s) {
		Stack<Character> stak = new Stack<Character>();
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			stak.add(array[i]);
		}
		StringBuilder builder = new StringBuilder();
		  for (int i = 0; i < array.length; i++)
			  builder.append(stak.pop());
		return builder.toString();
	}
	public static void main(String[] args) {
	/*	String str ="abacacde";
		System.out.println(XIhaTEst.reverse7(str));
		StringBuilder builder = new StringBuilder();
		while(str.length()>0){
			builder.append(str.charAt(0));
			String strs = str.replaceAll(str.charAt(0)+"", "");
			str=strs;
		}
		 System.out.println(builder.toString()); */
		StringBuilder a = new  StringBuilder("A");
		StringBuilder b = new StringBuilder("B");
		String str = "sadfa";
		operator(a, b,str);
		System.out.println(a+"<>"+b+"<>"+str);
	}
	public static void operator(StringBuilder x,StringBuilder y,String strs){
		x.append(y);y=x;
		strs="4444";
	}
}
