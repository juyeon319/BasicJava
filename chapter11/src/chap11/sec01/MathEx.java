package chap11.sec01;

//다음은 고객들의 마일리지 값이다. 
//이 중 마일리지가 1000보다 작은 회원의 마일리지는 1000으로 1000보다 큰 마일리지를 가진 회원이 보유한 마일리지를 출력하시오.(Math.max()사용)
//고객 마일리지는 배열처리 : 1200, 1800, 900, 3000, 750, 1600, 8700, 800, 5700, 2500 이다.

public class MathEx {

	public static void main(String[] args) {
		int[] mileage = {1200, 1800, 900, 3000, 750, 1600, 8700, 800, 5700, 2500};
		System.out.println("원본 마일리지  변경마일리지");
		for(int m : mileage) {
			System.out.printf("%6d    %6d\n", m, Math.max(m, 1000));
		}
	}
}
