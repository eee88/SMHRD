package 자바페스티벌1일차;

import java.util.Scanner;

public class Ex03정수반올림 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int value = 0;
		if (num % 10 < 5) {
			value = num - num % 10;
		} else {
			value = (num - num % 10) + 10;
		}
		System.out.println("반올림 수 : " + value);
	}

}
