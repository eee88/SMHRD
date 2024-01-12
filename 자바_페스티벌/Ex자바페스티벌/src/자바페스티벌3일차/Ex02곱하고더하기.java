package 자바페스티벌3일차;

public class Ex02곱하고더하기 {

	public static void main(String[] args) {
		int num = 1;//num을 0으로 초기화 시키면 맨 처음이 77*0으로 계산됨 
		int sum = 0;//값을 담을 변수니까 0으로 초기화
		for (int i = 77; i >= 1; i--) {//77부터 1까지 1씩 감소
			// 77~1 * 1~77을 계산할거니까 for문 써서 77부터 1 나열
			sum += (i * num);//sum == sum + (i * num)
			num++;//1~77을 표현하려면 반복문 돌아갈 때마다 1씩 증가
		}
		System.out.println(sum);
	}

}
