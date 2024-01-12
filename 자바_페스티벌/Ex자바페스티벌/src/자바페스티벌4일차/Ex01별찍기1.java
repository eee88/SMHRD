package 자바페스티벌4일차;

import java.util.Scanner;

public class Ex01별찍기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수: ");
		int line = sc.nextInt();
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
