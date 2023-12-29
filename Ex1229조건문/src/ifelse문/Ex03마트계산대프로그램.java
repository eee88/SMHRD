package ifelse문;

import java.util.Scanner;

public class Ex03마트계산대프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요 : ");
		int set = 10000;
		int price = 0;
		int gift = sc.nextInt();
		if(gift >= 11) {
			price = set*gift-(set*gift)/10;
			System.out.println("가격은 " + price + "입니다.");
		}else {
			price = set*gift;
			System.out.println("가격은 " + price + "입니다. ");
		}
	}

}
