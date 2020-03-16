package com.xinyu.DataStructure.interview;

/**
 * 获取集合中第二小的数据
 * 时间复杂度  O(n)
 * @author ThinkPad-X1Carbon
 *
 */
public class GetSecondSmall {

	public static void main(String[] args) {
		int[] list = new int[]{0,1,2,3,4,5,6,7,8,9};
		System.out.println("当前集合第二小的数是："+getSecondSmall(list));
	}
	
	public static int getSecondSmall(int[] list){
		int max = Integer.MAX_VALUE;
		int firstSmall = max;
		int SecondSmall = max;
		
		for(int value : list){
			if(value < firstSmall){
				SecondSmall = firstSmall;
				firstSmall = value;
			}
			if(value < SecondSmall && value > firstSmall){
				SecondSmall = value;
			}
		}
		return SecondSmall;
	}

}
