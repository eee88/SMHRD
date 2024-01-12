package 자바페스티벌3일차;

public class Ex01더하고빼기 {

	public static void main(String[] args) {
		int result = 0;
		int i = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(-i + " ");
				result += -i;
			}
			if (i % 2 == 1) {
				System.out.print(i + " ");
				result += i;
			}
		}
		
		System.out.println("\n결과 : " + result);
	}

}
