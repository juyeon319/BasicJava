package chap02.sec01;

public class VaribleExample02 {
	static int val1=200;
	public static void main(String[] args) {
		//���� ���� ����
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum+=i;
			System.out.println("i="+i);
		}
		System.out.println("val1="+val1);
		System.out.println("sum="+sum);
	}
	
	public static void myMethod() {
		System.out.println("val1="+val1);
	}
}
