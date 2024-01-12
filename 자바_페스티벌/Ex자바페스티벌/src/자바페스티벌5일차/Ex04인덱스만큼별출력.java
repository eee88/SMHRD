package 자바페스티벌5일차;

import java.util.Scanner;

public class Ex04인덱스만큼별출력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] stars = new int[5];

		for (int i = 0; i < stars.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			stars[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(stars[i] + ":");
			for (int j = 0; j < stars[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
