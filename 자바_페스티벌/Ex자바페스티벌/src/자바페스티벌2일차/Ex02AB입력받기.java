package 자바페스티벌2일차;

import java.util.Scanner;

public class Ex02AB입력받기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("A 입력 >>");
			int A = sc.nextInt();
			System.out.print("B 입력 >>");
			int B = sc.nextInt();
			if (A == 0) {
				if (B == 0) {
					break;
				}
			}
			System.out.print("결과 >> " + (A - B));
			System.out.println();
		}
	}
}
