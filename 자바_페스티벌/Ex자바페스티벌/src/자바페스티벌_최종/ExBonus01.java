package 자바페스티벌_최종;

import java.util.Scanner;

public class ExBonus01 {

	public static void main(String[] args) {
//		제한시간 : 12분
//		획득점수 : 22점
//		걸린시간 : 5분
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("A입력>> ");
			int A = sc.nextInt();
			System.out.print("B입력>> ");
			int B = sc.nextInt();
			if (A == 0 && B == 0) {
				break;
			} else {
				System.out.print("결과 >> " + (A - B));
			}
			System.out.println();
		}
	}

}
