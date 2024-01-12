package 자바페스티벌1일차;

import java.util.Scanner;

public class Ex04세자리수계산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력>> ");
		int first = sc.nextInt();
		System.out.print("두 번째 숫자 입력>> ");
		int second = sc.nextInt();
		System.out.println(first * (second % 10));
		System.out.println(first * ((second / 10) % 10));
		System.out.println(first * (second / 100));
		System.out.println(first * second);

	}

}
