package java_for_begginer;

//28번
public class Problem28 {
	public static final int PHYSICAL=23;
	public static void main(String[] args) {
		int index = PHYSICAL;
		int days = 1200;
		double result = 100*Math.sin((days%index)*2*Math.PI/index);
		
		System.out.printf("%1$.2f\n",result);
		/*printf 를 쓴이유 : %f 를 쓰려고
		 * 1$ : 첫번째 인자를 가져온다.
		 * printf("%3$d %2$d %1$d",num1,num2,num3); 처럼 쓰면
		 * 출력은 num3 ~ num1순서로 된다. 인자를 여러 순서로 출력할때 좋아보임*/
	}
}