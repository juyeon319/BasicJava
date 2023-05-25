package chap06.sec03;

//예제3) 두 숫자를 입력 받아 덧셈의 결과를 반환하는 메서드를 작성하시오.
//두 숫자의 타입은 [int, int], [int, double], [double,int], 
//[int,float]이다.
 
public class CalculateEx {

	public static void main(String[] args) {
		Calculate c1 = new Calculate();
		int res1 = c1.add(100, 200);
		double res2 = c1.add(27.5, 50);
	}
}

class Calculate {
	public int add(int a, int b) {
		return (a+b);
	}
	
	public double add(int a, double b) {
		return (a+b);
	}
	
	public double add(double a, int b) {
		return (a+b);
	}
	
	public float add(int a, float b) {
		return (a+b);
	}
}
