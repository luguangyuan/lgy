package com.guanguan.common;

public class Testhaha {
	public static int BiSearchNonRecursive(int Array[], int low, int length,
			int key) {
		// 给出数组[1, 2, 3, 4, 5, 6, 7]，实现二分查找数组元素，用递归方式查找元素 4 和非递归方式查找元素 5 。
		int high = length - 1;

		while (low <= high) {
			// No.1
			// 开始写代码，第一种非递归方式查找元素 4
			int middle = (low + length) / 2;
			if (Array[middle] == key) {
				return middle;
			}
			if (Array[middle] > key) {
				high = middle - 1;
			}
			if (Array[middle] < key) {
				low = middle + 1;
			}

			// end_code
		}
		return -1;

	}

	public static int BiSearchRecursive(int Array[], int low, int high, int key) {

		if (low <= high) {
			int middle = (low + high) / 2;
			// No.2
			// 开始写代码，第二种用递归方式查找元素 5
			if (Array[middle] == key) {
				return middle;
			} else if (Array[middle] > key) {
				return BiSearchRecursive(Array, low, middle - 1, key);
			} else {
				return BiSearchRecursive(Array, middle + 1, high, key);
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int number[] = { 1, 2, 3, 4, 5, 6, 7 };
		int index;
		int key;
		key = 4;
		index = BiSearchNonRecursive(number, 0, number.length, key) + 1;
		if (index == 0)
			System.out.println("不存在");
		else
			System.out.println("目标数字" + key + "在数组中第" + index + "位");
		key = 5;
		index = BiSearchRecursive(number, 0, number.length - 1, key) + 1;
		if (index == 0)
			System.out.println("不存在");
		else
			System.out.println("目标数字" + key + "在数组中第" + index + "位");
	}
}
