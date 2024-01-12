package 자바페스티벌_최종;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//제한시간 : 10분
		//획득점수 : 15점
		//걸린시간 : 2분
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int hang = sc.nextInt();
		for (int i = 0; i < hang; i++) {
			for (int j = hang; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}