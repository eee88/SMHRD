package 자바페스티벌1일차;

import java.util.Scanner;

public class Ex02거스름돈계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		System.out.println("\n잔돈 : " + money + "원\n" + "10000원 : " + money / 10000 + "개\n" + "5000원 : "
				+ money % 10000 / 5000 + "개\n" + "1000원 : " + money % 5000 / 1000 + "개\n" + "500원 : "
				+ money % 1000 / 500 + "개\n" + "100원 : " + money % 500 / 100 + "개");
	}

}
