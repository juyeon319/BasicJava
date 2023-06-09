package chapter02.sec02;

public class IntegerExample {

	public static void main(String[] args) {
		// 정수 타입 : byte, short, int(기본형), long
		// byteMethod();
		intMethod();
	}

	public static void byteMethod() {
		// byte : 1byte 제공
		// 127 ~ -128까지의 정수를 저장
		// 범위를 벗어난 값을 저장하면 오류
		// 연산된 데이터가 범위를 벗어나면 순환적용 된 결과 반환
		// (0,1,2,...127,-128,-127,...-1)
		byte b1 = 127;
		byte b2 = -128;
		System.out.println("b1=" + b1);
		b1++;
		System.out.println("b1=" + b1);
	}

	public static void shortMethod() {
		// short : 2byte 제공
		// 32767 ~ -32768까지의 정수를 저장
		// 범위를 벗어난 값을 저장하면 오류
		// 연산된 데이터가 범위를 벗어나면 순환적용 된 결과 반환
		// (0,1,2,...32767,-32768,-32767,...-1)

		// short sh1=32768; error!
		short sh2 = 200;
		short sh3 = 32767;
		System.out.println(++sh3);
	}

	public static void intMethod() {
		// int : 4byte 제공
		// 기본 정수형
		// 2147483647 ~ -2147483648까지의 정수를 저장
		// 범위를 벗어난 값을 저장하면 오류
		// 연산된 데이터가 범위를 벗어나면 순환적용 된 결과 반환
		// (0,1,2,...2147483647,-2147483648,-2147483647,...-1)
	int num = 200;
	int num1 = 10000000;
	long num2 = 10000000L;
	
	int res = num1*num1;
	System.out.println(res);
	
	long res1 = num2*num2;
	System.out.println(res1);
	
	}
}
