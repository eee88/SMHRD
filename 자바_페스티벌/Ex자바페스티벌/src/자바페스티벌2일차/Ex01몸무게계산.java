package 자바페스티벌2일차;

import java.util.Scanner;

public class Ex01몸무게계산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		int week = 1;
		while (true) {
			System.out.print(week++ + "주차 감량 몸무게 : ");
			int lose = sc.nextInt();
			now -= lose;
			if (now <= goal) {
				System.out.println(now + "kg 달성!! 축하합니다!");
				break;
			}
		}
	}
}
