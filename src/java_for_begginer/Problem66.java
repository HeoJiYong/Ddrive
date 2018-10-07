package java_for_begginer;

//문제 66번
//String 으로 선언된 문자열 비교
//new로 생성된 String, new 없이 생성된 String
public class Problem66 {

	public static void main(String[] args) {

		String city1 = "Asia";
		String city2 = "Europe";
		String city3 = new String("Asia");
		String city7 = "Asia";
		
		//new로생성한 객체는 Stack의 레퍼런스가 다르다.
		//값이 같다면 Heap의 해쉬코드는 같을수 있다.
		//==는 객체의 stack의 레퍼런스를 비교한다. (=값이 같아도 new로 선언된거면 false 반환)
		//.equals() 는 객체의 해쉬코드를 비교한다 (=레퍼런스가 달라도 값이 같으면 true를 반환)
		System.out.println(city1); // "Aisa"
		System.out.println(city1.length()); // city1의 문자열 길이
		System.out.println(city1 == city2); // Asia랑 Europe 비교
		System.out.println(city1 == city3); // Asia랑 new로 만든 Asia 비교
		System.out.println(city1 == city7); // Asia랑 Asia 비교
		System.out.println(city1.equals(city3));// 그냥 선언된 city1, new로 선언된 city 3비교
		System.out.println(city1.equals(city7));// 그냥 선언된 두개 비교

		//원하는 format으로 문자열을 만든다는 뜻.
		//"Asia-Europ"이 된다.
		String city4 = String.format("%s-%s", city1, city2);
		System.out.println(city4);
		
		//문자열+문자열+1+2 를 한다.
		//문자열을 만나는순간 city5는 이후값을 문자열로 받게되어 "Asia-Europe12" 가 된다
		String city5 = city1 + "-" + city2 + 1 + 2;
		System.out.println(city5);	// "Asia-Europe12" ??
		
		//1+2+문자열+문자열을 한다
		//sity6는 1+2를 수행후 3을 저장한다. 이후문자열을 만나 "3Aisa-Europe" 이 된다.
		String city6=1+2+city1+"-"+city2;
		System.out.println(city6);// "12Asia-Europe" ??
	}

}
