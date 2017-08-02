package com.jy;

public class Main {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		int number = 20;
		System.out.println(number + "是否在二维数组中：" + find(matrix, number));
	}

	/**
	 * 查找输入的数是否在给定的二维数组中
	 * 
	 * @param matrix
	 *            二维数组
	 * @param number
	 *            给定的数
	 * @return true 存在 false 不存在
	 */
	private static boolean find(int[][] matrix, int number) {
		boolean find = false;
		// 鲁棒性检查
		// 给定的数组非空，且至少有一行一列
		if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
			return false;
		// 从左下角开始循环查找
		int row = matrix.length - 1;
		int column = 0;
		while (row >= 0 && column < matrix[0].length) {
			if (matrix[row][column] == number) { // 左下角的数正好与要查找的数相等
				find = true;
				break;
			} else if (matrix[row][column] > number) { // 左下角的数大于要查找的数
				row--;
			} else { // 左下角的数小于要查找的数
				column++;
			}
		}
		return find;
	}

}
