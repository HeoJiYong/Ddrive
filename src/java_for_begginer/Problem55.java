package java_for_begginer;

//문제 55번
//가변인자 이용해보기 (varage 또는 variable argument 라고한다.)
//오버로딩 이용할때 메소드 수를 줄일수 있다. 
public class Problem55 {


	//int ...mm 식으로 자료형-변수명 사이에 ...을 넣는다
	//몇개를 넣어도 상관없으나 자료형은 맞아야 한다.
	public static void print(int ...mm) {
		for(int m : mm)
		{
			System.out.printf("%d, ",m);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int mm[] = {1,6,16,22,23,33};
		print(mm);	//배열도 주고
		int a=1,b=6,c=16;
		print(a);	//정수형 변수
		print(a,b,c);	//변수 세개
		print(1,2,4);	//정수 값
		print(1,2,a,b,4);//정수값, 정수형 변수
	}

}
