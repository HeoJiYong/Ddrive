package java_for_begginer;

//문제 54번
//C#의 foreach같은 for 사용해보기
public class Problem54 {

	public static void main(String[] args)
	{
		int mm[] = {1,6,16,22,23,33};
		for(int m: mm)	//m선언,
			System.out.printf("%d\n",m);	//mm[i]번째가 들은 m 출력
	}
}
