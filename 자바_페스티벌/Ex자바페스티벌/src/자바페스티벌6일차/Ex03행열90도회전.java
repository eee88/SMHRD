package 자바페스티벌6일차;

import java.util.Iterator;

public class Ex03행열90도회전 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int sum = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = sum++;
			}
		}
		System.out.println("원본");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("90도 회전");
		for (int i = array.length-1; i >= 0; i--) {
			for (int j = 0; j <array.length; j++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
