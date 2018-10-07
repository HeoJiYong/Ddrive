package java_for_begginer;

//문제 50번
//10진수를 2진수 문자열로 바꾸기 . shift 연산자 이용
public class Problem50 {

	public static String shift(int a)
	{
		String s="";	//문자열을 비운상태로 초기화
		for(int i=0;i<=31;i++)	//최대 32비트까지
		{
			int aa= a%2;	//2로나눈 나머지를 a에 저장
			/*a가 양수일때 그대로넣고, 음수일때 부호 바꿔서 넣는다.
			 aa(=새로운 비트) + s(원래있던 비트) 한다.
			 * */
			s=(aa>=0)?aa+s:(-aa)+s;
			
			a>>=1;	// a를 2로 나눠서 다시 저장
		}
		return s;
	}
	
	public static void main(String[] args) {
		int num1 = 123;
		int num2 = -123;
		System.out.printf("%d : %s\n", num1,shift(num1));
		System.out.printf("%d : %s\n", num2,shift(num2));
	}

}
