package 자바페스티벌5일차;

import java.util.Scanner;

public class Ex06채점하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] test = new String[6];
		int j = 0;
		int score = 0;
		System.out.println("==== 채점하기 ====");
		for(int i = 0;i<test.length;i++) {
			test[i] = sc.next();
			char  c = test[i].charAt(0);
			if(c == 'o') { //equals 써도 될듯
				score +=(i+1);
			}else {
				
				
			}
		}
		System.out.println(score);
		
	}

}
//해결 X