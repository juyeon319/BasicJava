package chap03.sec01;

public class BinaryOperator02 {
	
	public static void main(String[] args) {
		shiftOperator();
		//비트, 대입, 이동 => 이항연산자
	}
	
	public static void bitwiseOperator() {
		//비트별 연산자 : |, &, ^
		int n1=35;
		int n2=23;
		System.out.println("n1 & n2 = " + (n1 & n2)); //2+1
		System.out.println("n1 | n2 = " + (n1 | n2)); //32+16+4+2+1
		System.out.println("n1 ^ n2 = " + (n1 ^ n2)); //32+16+4
	}
	
	public static void shiftOperator() {
		//이동 연산자 : <<(left shift), >>(right shift)
		//>>>(right shit whit sign bit)
		
		int num=35;
		System.out.println("35>>2 = "+(num>>2));
		System.out.println("35<<2 = "+(num<<2));
		
		num=-35;
		System.out.println("35>>>1 = "+(num>>>1));
	}
	
	public static void assignOperator() {
		//대입 연산자 : =, 우선순위가 제일 낮음
		//결합 대입 연산자 : +=, -=, *=, /=, %=
		//변수=변수 연산자(+, -, *, /) 값
		//변수 연산자 = 값;
		
		int res=0;
		int num=100;
		
		res=res+10; //res+=10;
		res=res*(num/10); //res*=(num/10);
	}
}
	
	