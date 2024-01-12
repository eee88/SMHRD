package 자바페스티벌3일차;

import java.util.Scanner;

public class Ex06구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단수입력 :");
		int step = sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int what = sc.nextInt();
		System.out.println(step + "단");
		for(int i = 1;i<=what;i++) {
			System.out.println(step + "*" + i + "=" + step*i);
		}
	}

}
