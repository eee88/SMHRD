package 자바페스티벌3일차;

import java.util.Scanner;

public class Ex05정수의합출력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int N = sc.nextInt();//예시: 12345678을 입력받음
		int sum = 0;//나머지를 담을 변수
		int remain = 0;// 나머지들을 더한 값을 담을 변수
		for(int i = 1;i<=8;i++) {//8자리 수니까 8번 반복
			sum = N%10;//나머지를 저장  예시: 8이 저장됨
			N /= 10;//저장한 나머지를 버려주기 예시: 1234567
			remain += sum;//나머지들을 더해줌
		}
		System.out.println("합은 " + remain + "입니다.");
		
	}

}