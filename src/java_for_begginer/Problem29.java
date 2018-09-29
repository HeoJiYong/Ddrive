package java_for_begginer;
//29번
public class Problem29 {
	public static final int PHYSICAL = 23;
	//final : C언어의 const 와 같은 효과
	
	public static double get(int index, int days) {
		return (100 * Math.sin((days % index) * 2 * Math.PI / index));
	}

	public static void main(String[] args) {
		int index = PHYSICAL;
		int days = 1200;
		double result;
		result = get(index, days);
		
		System.out.printf("%1$.2f\n", result);
	}
}
