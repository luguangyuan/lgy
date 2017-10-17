package com.by.email;

import java.util.Stack;

public class SourcSub2 extends Wapper {

	public void methed2() {
		System.out.println("sub2");
	}

	public static boolean perge(String scn) {
		char[] arry = scn.toCharArray();
		Stack<String> sta = new Stack<String>();
		for (int i = 0; i < arry.length; i++) {
			String c = arry[i] + "";
			if ("(".equals(c) || "[".equals(c)) {
				System.out.println("<<<<");
				sta.push(c);
			}
			if (")".equals(c)) {
				if (sta.isEmpty()) {
					return false;
				} else if (sta.peek().equals("(")) {
					sta.pop();
				}
			}
			if ("]".equals(c)) {
				if (sta.isEmpty()) {
					return false;
				} else if (sta.peek().equals("[")) {
					sta.pop();
				}
			}
		}
		System.out.println(sta.size());
		if (sta.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(SourcSub2.perge("()[]([)[]"));
	}
}
