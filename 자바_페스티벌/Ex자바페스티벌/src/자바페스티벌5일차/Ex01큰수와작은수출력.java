package 자바페스티벌5일차;

import java.util.Arrays;
import java.util.Random;

public class Ex01큰수와작은수출력 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] array = new int[8];
		int max = 0;
		int min = 0;
		for(int i = 0;i < array.length;i++) {
			array[i] = ran.nextInt(100) + 1;
			
		}
		for(int i = 0;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		min = max;
		for(int i = 0;i<array.length;i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		System.out.println("배열에 있는 모든 값 : " + Arrays.toString(array));
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
