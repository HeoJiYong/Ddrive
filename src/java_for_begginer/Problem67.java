package java_for_begginer;

//문제 67번
//문자열로 이것저것 해보기
public class Problem67 {
	public static void main(String[] args) {
		String text = " Hello java4Android";
		String com = " HELLO java4Android";

		System.out.println("1. " + text.charAt(2));
		System.out.println("2. " + text.concat("s"));//끝에 s 붙임
		System.out.println("3. " + text.contains("And"));//"And"를 포함하는지 
		System.out.println("4. " + text.equals(com));//해시코드값이 같은가?
		System.out.println("5. " + text.equalsIgnoreCase(com));//대소문자 무시하고 같은가?
		System.out.println();

		System.out.println("6. " + text.indexOf("a"));	//왼쪽 a의 인덱스값
		System.out.println("7. " + text.lastIndexOf("a"));	//오른쪽 a의 인덱스값
		System.out.println("8. " + text.trim());	//문자열 양끝의 공백제거
		System.out.println("9. " + text.length());	//공백포함 문자열 길이
		System.out.println("10. " + text.substring(7));	//7부터 출력
		System.out.println();

		System.out.println("11. " + text.substring(7, 11));	//7~11출력
		System.out.println("12. " + text.replace(" ", "-"));	//앞의걸 뒤에걸로 바꾼다
		System.out.println("13. " + text.replaceAll(" ", "-"));
		System.out.println("14. " + text.toUpperCase());//전부 대문자로
		System.out.println("15. " + text.toLowerCase());//전부 소문자로
		System.out.println();

		//String text속의 " " 을 기준으로 잘라내어 문자열로 저장.
		String[] sp = text.split(" ");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(i + "\t\t" + sp[i] + "\t\t" + sp[i].length());
		}
	}

}
