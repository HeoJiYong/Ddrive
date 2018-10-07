package java_for_begginer;

//문제 51번
//비트연산자 &를 이용한 "10진수를 2진수 문자열로 바꾸기"
//&연산자는 비트에대해 직접 연산(마스킹) 을 하므로 부호에 신경쓰지 않아도 된다.
public class Problem51 {

	public static String BitMask(int a)
	{
		int BITMASK = 1;	//0000001 을 가지고 계속 마스킹 한다.
		String s="";
		for(int i=0;i<31;i++)
		{
			s = (a&BITMASK)+s;	//새로나온 문자열+기존문자열
			a>>=1;	//a= a>>1 이란뜻 (a = a/2 라는뜻)
		}
		return s;
	}
	
	public static void main(String[] args)
	{
		int num1 = 123;
		int num2 = -123;
		System.out.printf("%d : %s\n", num1,BitMask(num1));
		System.out.printf("%d : %s\n", num2,BitMask(num2));
	}
}
