package java_for_begginer;

//문제 64
public class Problem64 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1.hashCode());	//10진수
		System.out.println(Integer.toHexString(obj1.hashCode()));	//16진수로
		System.out.println(obj1 == obj2);	//flase
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
