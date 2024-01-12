package 자바페스티벌5일차;

public class Ex05최소거리출력 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int min = 92;
		int j = 6;
		for (int i = 0; i < point.length; i++) {

			if (point[i] - point[j] < min) {
				min = point[i] - point[j];
				// System.out.println("result " + i +","+ j );
				j--;
			}

			System.out.println(min);
		}
	}

}
