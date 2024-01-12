package 자바페스티벌3일차;

import java.util.Scanner;

public class Ex04등차증가수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int suyeol = 1;

		for (int i = 0; i < n; i++) {
			suyeol = i + suyeol;
			System.out.print(suyeol + " ");
		}
	}
}
