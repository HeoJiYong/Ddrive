package java_for_begginer;

//문제 49번
public class Problem49 {
	
	/*booelan 형식은 C++의 bool 형식과 같다.*/
	public static boolean IsPrime(int n)
	{
		/*제곱근 구하는 sqrt 메소드는 Math 클래스안에있다*/
		int temp =(int)Math.sqrt(n);
		for(int i=2;i<temp;i++)
		{
			if((n&i)==0)	//한번이라도 나누어 떨어지면
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int number=54213;
		if(IsPrime(number))
			System.out.println(number+"는 소수다");
		else
			System.out.println(number+"는 소수가 아니다");
	}
}