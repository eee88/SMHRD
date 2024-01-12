package 자바페스티벌_최종;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//제한시간 : 8분
		//획득점수 : 10점
		//걸린시간 : 4분
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요: ");
		int time = sc.nextInt();
		int pay = 0;
		if(time>8) {
			pay = (time - 8) * 7500 + 8*5000;
		}else {
			pay = time * 5000;
		}
		System.out.println("총 임금은 " + pay + "원 입니다.");
	}

}
