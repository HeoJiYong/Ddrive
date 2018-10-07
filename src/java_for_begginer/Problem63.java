package java_for_begginer;

//문제 63번
//try-catch-finally문, 수학연산 예외처리하기 (0으로 나누기)
//ArithmeticException
public class Problem63 {

	public static void main(String[] args) {
		try {
			int x=5;
			int y=20/(5-x);
			System.out.println(y);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눴나 다시 확인해보세요");
		}
		finally {
			System.out.println("꼭 실행되는 finally문");
		}
	}

}
