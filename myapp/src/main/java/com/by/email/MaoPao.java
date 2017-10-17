package com.by.email;

public class MaoPao {

	/**
	 * 冒泡排序
	 * @param arr
	 * @return
	 */
	public static int[] maopao(int[] arr){
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]){
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr;
	}
	
	public static int getMiddle(int[] arr,int low,int high){
		int temp = arr[low];
		while(low<high){
			while(low<high&&arr[high]>temp){
				high--;
			}
			arr[low]=arr[high];
			while(low<high&&arr[low]<temp){
				low++;
			}
			arr[high]=arr[low];
		}
		arr[low]=temp;
		
		return low;
	}
	public static void quickSort(int[] arr,int low,int high){
		if(low<high){
			int middle = getMiddle(arr, low, high);
			quickSort(arr, low, middle-1);
			quickSort(arr, middle+1, high);
		}
	}
	
	public static void quick(int[] arr){
		if(arr.length>1){
			quickSort(arr, 0, arr.length-1);
		}
	}
	
	public static void checkSort(int[] array){
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			int k = i;
			for(int j=array.length-1;j>i;j--){
				if(array[j]<array[k]){
					k=j;
				}
			}
			temp=array[i];
			array[i]=array[k];
			array[k]=temp;
		}
	}
	
	public static void inserSort(int[] arr){
		int length = arr.length;
		int j = 0;
		int temp = 0;
		for (int i = 0; i < length-1; i++) {
			temp= arr[i];
			for(j=i;j>0&&temp<arr[j-1];j--){
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
		
		
		
	}
	public static void main(String[] args) {
		int[] arr={1,5,0,2,3,10};
		//int[] arrs = MaoPao.maopao(arr);
		//MaoPao.quick(arr);
		//MaoPao.quick(arr);
		MaoPao.inserSort(arr);
		for (int i : arr) {
			System.out.print(i+",");
		}
	}
	
}
