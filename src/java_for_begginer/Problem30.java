package java_for_begginer;
//30번
public class Problem30 {
	public static final int PHYSICAL = 23;
	
	public double getBioRhythm(int index, int days) {
		return (100 * Math.sin((days % index) * 2 * Math.PI / index));
	}

	/*메서드에 static 안붙으면 멤버메서드.
	 *멤버메서드는 사용하려면 객체를 생성.
	 *이후 객체.Method 식으로 접근해서 사용해야함
	 */
	public static void main(String[] args) {
		int index = PHYSICAL;
		int days = 1200;
		double result;
		Problem30 obj = new Problem30();
		result = obj.getBioRhythm(index, days);
		
		System.out.printf("%1$.2f\n", result);
	}
}
