package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ticket = 5000;
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("인원 수를 입력하세요 : ");
		int num = sc.nextInt();
		if(age < 20) {
			System.out.println("총" + ticket/2*num + "입니다.");
		}else {
			System.out.println("총" + ticket*num + "입니다. ");
		}
	}
	//지역변수(local variable)
	//:{} 영역 안에서 선언된 변수는 {}영역 안쪽에서만 사용이 가능하다
	//---> {} :scope
}
