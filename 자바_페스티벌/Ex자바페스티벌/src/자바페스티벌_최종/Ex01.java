package 자바페스티벌_최종;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//제한시간 : 8분
		//획득점수 : 10점
		//걸린시간 : 5분
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		int week = 1;
		int lose = 0;
		while(true) {
			System.out.print(week++ + "주차 감량 몸무게 : ");
			lose = sc.nextInt();
			now -= lose;
			if(now<=goal) {
				break;
			}
		}
		System.out.println(now + "kg 달성!! 축하합니다!");
	}

}
