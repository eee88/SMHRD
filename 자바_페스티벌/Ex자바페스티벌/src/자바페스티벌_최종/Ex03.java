package 자바페스티벌_최종;

public class Ex03 {

	public static void main(String[] args) {
		//제한시간 : 8분
		//획득점수 : 10점
		//걸린시간 : 4분
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(-i + " ");
				sum += -i;
			} else {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("\n결과 : " + sum);
	}

}
