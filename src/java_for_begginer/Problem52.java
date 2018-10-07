package java_for_begginer;

//문제 52번
//문자열 메소드를 이용해 필요없는0 제거하기 + 10진수->2진수 문자열로 만들기
//00000101 -> 101 로 바꾸기
public class Problem52 {
	public static String BitMask(int a)
	{
		int BITMASK = 1;
		String s="";
		for(int i=0;i<31;i++)
		{
			s=(a&BITMASK)+s;
			a>>=1;
		}
		/*String.substring() : 배열을 부분적으로 출력한다. ()안에는 시작점(인덱스)
		 * String.substring(24) == 24번 부터 출력한다
		 * String.indexOf() : 배열의 처음부터 탐색-> ()안의 값을 찾으면 그부분을 반환*/
		return s.substring(s.indexOf('1'));
	}
	
	
	public static void main(String[] args)
	{
		int num1 = 123;
		int num2 = -123;
		System.out.printf("%d : %s\n", num1,BitMask(num1));
		System.out.printf("%d : %s\n", num2,BitMask(num2));
	}
}
