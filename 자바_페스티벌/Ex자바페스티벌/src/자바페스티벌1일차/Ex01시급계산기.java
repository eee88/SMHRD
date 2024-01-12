package 자바페스티벌1일차;

import java.util.Scanner;

public class Ex01시급계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int pay = 0;
		if (time > 8) {
			pay = (time - 8) * 7500 + 8 * 5000;
			// 7500은 시급 5000원에 1.5배
			// 8시간까지는 시급 5000원으로 계산 8시간 초과한 시간은 시급 7500원으로 계산

		} else {
			pay = time * 5000;
		}
		System.out.println("총 임금은 " + pay + "원 입니다.");
	}

}
