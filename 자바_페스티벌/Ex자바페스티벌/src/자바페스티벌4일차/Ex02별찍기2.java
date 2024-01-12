package 자바페스티벌4일차;

import java.util.Scanner;

public class Ex02별찍기2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수: ");
		int line = sc.nextInt();
		for (int i = 0; i < line; i++) {
			for (int j = line; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
