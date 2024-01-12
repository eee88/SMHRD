package 자바페스티벌_최종;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//제한시간 : 15분
		//획득점수 : 10점
		//걸린시간 : 5분
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int pay = sc.nextInt();
		System.out.println();
		System.out.println("잔돈 : " + pay + "원\n"
				+ "10000원 : " + pay/10000 + "개\n" 
				+ "5000원 : " + pay%10000/5000 + "개\n"
				+ "1000원 : " + pay%5000/1000 + "개\n"
				+ "500원 : " + pay%1000/500 + "개\n"
				+ "100원 : " + pay%500/100 + "개\n");
	}

}
