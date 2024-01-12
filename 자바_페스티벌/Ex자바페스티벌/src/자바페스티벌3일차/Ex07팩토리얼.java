package 자바페스티벌3일차;

import java.util.Scanner;

public class Ex07팩토리얼 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int N = sc.nextInt();
		int output = 1;
		for (int i = 1; i <= N; i++) {
			output *= i;
		}
		System.out.println("출력 : " + output);
	}

}
