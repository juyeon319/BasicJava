package chap05.sec02;

import java.util.Scanner;

public class OneDimArrayEx02 {

	public static void main(String[] args) {
		OneDimArray02 od2 = new OneDimArray02();
		od2.setName();
		od2.getName();
		od2.exchange();
	}
}
//	예제2) 키보드로 5명의 친구이름 입력 받아 배열에 저장하고 역순으로 출력하시오.
class OneDimArray02 {
	Scanner sc = new Scanner(System.in);
	String[] name = new String[5];
	
	public void setName() {
		for(int i=0; i<name.length; i++) {
			System.out.print((i+1) + ". 친구이름 입력 : ");
			name[i] = sc.nextLine();
		}
	}
	
	//역순
	public void getName() {
//		for(int i=name.length-1; i>=0; i--) {
			for(int i=0; i<name.length; i++) {
				System.out.println(name[(name.length-1)-i]);
			}
		}
	
//	예제3) 예제2의 첫 번째 친구이름과 마지막 친구 이름을 서로 바꾸시오.
	public void exchange() {
		String temp = null;
		temp = name[0];
		name[0] = name[4];
		name[4] = temp;
		
		for(String str : name) {
			System.out.printf("%5s", str);
		}
	}
}

