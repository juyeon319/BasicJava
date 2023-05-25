package chap05.sec02;

import java.util.Scanner;

public class OneDimArrayEx03 {

	public static void main(String[] args) {
		OneDimArray03 od3 = new OneDimArray03();
		od3.getLottoNumber();
	}
}

// 예제4) 로또번호를 생성하여 출력하시오.
class OneDimArray03 {
	int[] lotto = new int[45];
	
	OneDimArray03() {
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
	}
	
	public void suffle() {
		for(int i=0; i<10000000; i++) {
			int rnd = (int)(Math.random()*45);
			int temp = lotto[0];
			lotto[0] = lotto[rnd];
			lotto[rnd] = temp;
		}
	}
	
// 예제5) 금액을 1000원 단위로 입력하여 예제4번의 로또번호를 금액만큼 출력하시오.	
	public void getLottoNumber() {
		Scanner sc =  new Scanner(System.in);
		System.out.print("구입금액을 1000원 단위로 입력 : ");
		int money = Integer.parseInt(sc.nextLine());
		for(int i=1; i<= money/1000; i++) {
			suffle();
			System.out.printf("%2d : ", i);
			for(int j=0; j<6; j++) {
				System.out.printf("%5d", lotto[j]);
			}
			System.out.println();
		}
	}
}