package com.guanguan.common;


public class Testxix {
	public static int charIndex(String text) {
		int length = 0;
		if (null == text || (length = text.length()) == 0) {
			return 0;
		}
		char currentChar;
		char nextChar;
		//No.1
		//开始写代码，实现charIndex方法，计算该字符串中第一个不重复的字符所在的位置
		for(int i= 0;i<text.length();i++){
			
			if(i==(text.lastIndexOf(text.charAt(i)))){
				return i;
			}
		}	

		return 0;
	}

	public static void main(String[] args) {
		int digital = 0;//数字个数
		int character = 0;//英文个数
		int other = 0;//其他字符个数
		int blank = 0;//空格个数
		char[] chars = null;
		System.out.println("这是任意一串字符：");
		String string = "djpqo ioghr4 8595 72hr37jW$%!";
		chars = string.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			//No.1
			//开始写代码，计算任意一串字符中的数字个数、英文字母个数、空格个数和其他字符个数
            char c = string.charAt(i);
            if (c >= '0' &&  c <= '9') {
                digital++;
            } else if ((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')) {
                character++;
            } else if (c == ' ') {
                blank++;
            } else{
                other++;
            }
		}
		System.out.println("数字个数: " + digital);
		System.out.println("英文字母个数: " + character);
		System.out.println("空格个数: " + blank);
		System.out.println("其他字符个数:" + other);
		//String string="16a6df421";
		System.out.println("第一个不重复的字符在字符串中第 " + charIndex(string) + " 位");
	}
}
