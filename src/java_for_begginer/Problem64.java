package java_for_begginer;

//문제 64
//Object는 자바의 최상위 클래스로 중요메소드 4개를 제공한다.
public class Problem64 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1.hashCode());	//객체릐 1차 주소 10진수로
		System.out.println(Integer.toHexString(obj1.hashCode()));	//주소를 16진수로
		System.out.println(obj1 == obj2);	//스택영역의 레퍼런스 비교.new로 생성하면 객체마다 고유해서 false 
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1);
		System.out.println(obj2.toString());
		System.out.println();

		System.out.println(obj1.getClass().getName());
		String str = obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode());
		System.out.println(str);
		System.out.println();

		Object objstr = new String("Good");
		System.out.println(objstr.toString());
		System.out.println(objstr instanceof Object);
		System.out.println(objstr instanceof String);
		System.out.println();

		String hello = "hello";
		System.out.println(hello.getClass());
	}

}
