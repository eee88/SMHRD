package 자바페스티벌_최종;

public class Ex06 {

	public static void main(String[] args) {
		//제한시간 : 8분
		//획득점수 : 15점
		//걸린시간 : 3분
		int sum = 0;
		int num = 1;
		for (int i = 77; i >=0; i--) {
			sum += i*num++;
		}
		System.out.println(sum);
	}

}
