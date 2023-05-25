package chapter02.sec03;

public class PromotionEX {

	public static void main(String[] args) {
		//promotion : 자동형 변환
		//표현범위가 큰쪽으로 변환
		//수식에서는 int보다 작은 타입의 자료는 int로 변환됨
		byte b1=100;
		short s1=20;
		
		int res1=b1+s1;
		
		float f1=20f;
		long l1=1000L;
		
		float res2=f1+l1;
		
		System.out.println(res1);
		System.out.println(res2);
	}
}
