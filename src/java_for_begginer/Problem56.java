package java_for_begginer;

import java.util.ArrayList;
import java.util.List;

//문제 56번
//배열대신 List 사용해보기

public class Problem56 {

	public static void main(String[] args) {
		/*Liset의 기본타입이 랩퍼 클래스라
		 * <Integer>로 선언하여 int자료형을 저장한다.*/
		List<Integer> test = new ArrayList<>();

		for (int i = 1; i <= 10; i++)
			test.add(i); // i를 넣는다.

		for (int i = 0; i < test.size(); i++) {
			int m = test.get(i);
			System.out.println(m);

		}
	}

}
