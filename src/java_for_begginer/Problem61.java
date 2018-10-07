package java_for_begginer;

//문제 61
//10진수->2진수로 변환 / String, char 이용
public class Problem61 {

	
	public static String BitMask(int value) {
		char[] val = new char[32]; // 32칸(32bit) 배열
		int BITMASK = 1;
		for (int i = 31; i >= 0; i--) {	//31번째 칸부터 시작
			if ((value & BITMASK) == 1) {
				val[i] = '1';// 1로마스킹해서 1 나오면 val 배열에 1저장
			} else
				val[i] = '0';// 그렇지 않다면 0이므로 0저장
			value= value>>>1;	//부호는 건들지않고 이동
		}
		return new String(val);	//새로운 String 객체를 val만큼 할당, 내용까지 반환
	}

	public static void main(String[] args) {
		int ival = 2345;
		int eval = -2345;
		
		String vals = BitMask(ival);
		System.out.println(vals);
		
		vals = BitMask(eval);
		System.out.println(vals);
		
		char[] vs = vals.toCharArray();	//vals 문자열을 문자배열로 변환한 vs를 만들어준다.
		System.out.println(vs[28]);	//vs 문자배열의 28번 인덱스를 출력
	}

}
