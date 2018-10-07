package java_for_begginer;

//문제 62번
//try - catch - finally 사용해보기
public class Problem62 {

	public static void main(String[] args) {
		String sNum="123";
		String nNum = "h";
		
		
		/* 문자열 안에 정수가있는 sNum을 넣으면
		 * Integer.parseInt()가 정상 작동 -> finally로 가게되고
		 * Integer.parseInt(nNum) 을 하게되면 타입 예외처리 발생, 첫번째 캐치문으로 간다
		 * 
		 * int a 대입문 대신 다른 예외문 (0으로 나누기 등) 을 넣으면
		 * 첫번째 캐치문에서 잡지 못해 두번째 캐치문으로 간다.
		 * */
		
		try {
			/* int a=Integer.parseInt(sNum); 대신
			 * int b = 2/0 같은걸 하면 두번째 캐치문으로 넘어간다. 
			 * */
			int a=Integer.parseInt(sNum);
			System.out.println(a);
		}
		catch(NumberFormatException ee){
			System.out.println("Int 인지 다시확인");
			System.out.println(ee.getMessage());			
		}
		catch(Exception ee) {
			System.out.println("다시 잘 넣어!");
		}
		finally {
			System.out.println("Finally 문 실행");
		}
	}
}
