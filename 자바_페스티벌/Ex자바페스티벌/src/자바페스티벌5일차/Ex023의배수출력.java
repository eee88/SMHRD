package 자바페스티벌5일차;

import java.util.Scanner;

public class Ex023의배수출력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for(int i = 0; i<array.length;i++) {
			System.out.print((i+1) + "번째 정수 입력>> ");
			array[i] = sc.nextInt();
		}
		System.out.print("3의 배수 : ");
		for(int i = 0;i<array.length;i++) {
			if(array[i]%3==0) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
