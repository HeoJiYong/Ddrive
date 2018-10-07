package java_for_begginer;

import java.util.ArrayList;
import java.util.List;

//문제 58
//1~10 홀수에대한 제곱의 합 구하기
//List, ArrayList 사용
public class Problem58 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int s = 0;

		for (int i = 1; i <= 10; i++)
			list.add(i);

		for (int m : list) {	//foreach로 접근
			if (m % 2 == 1) { // 각 원소값이 홀수면
				s = s + (m * m); // m제곱을 더한다.
				System.out.printf("%d ",m * m);
			}
		}
		System.out.println();
		System.out.println("1~10사이의 홀수에 대한 제곱합 : " + s);
	}

}
