package java_for_begginer;

//문제 53
//1~100까지의 홀수의 합 구하기
public class Problem53 {
	public static void main(String[] args) {
		int num = 0;

		for (int i = 1; i <= 100; i++)
			num = num + i;
		System.out.printf("1~100까지의 합 : %d\n", num);
		num = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				num = num + i;
		}
		System.out.printf("1~100까지의 홀수 합 : %d\n", num);
	}
}
