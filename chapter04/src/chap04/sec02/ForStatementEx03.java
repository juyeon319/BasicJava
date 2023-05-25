package chap04.sec02;

public class ForStatementEx03 {

	public static void main(String[] args) {
		ForStatement03 fs = new ForStatement03();
		System.out.println("[1번 도형]");
		fs.shape1();
		System.out.println("[2번 도형]");
 		fs.shape2();
 		System.out.println("[3번 도형]");
 		fs.shape3();
 		System.out.println("[4번 도형]");
 		fs.shape4();
 		System.out.println("[5번 도형]");
 		fs.shape5();
	}
}

class ForStatement03 {
	//예제8 다음의 도형을 출력하는 프로그램 작성
	//1)      2)       3)           4)       5)
//		 *		  *****        *           *     *****
//		 **        ****       ***         **     ****
//	     ***        ***      *****       ***     ***
//	     ****        **     *******     ****     **
//	     *****        *    *********   *****     *
	public void shape1() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void shape2() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
		}
			for(int j=0; j<(5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void shape3() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<(4-i); j++) {
				System.out.print(" ");
		}
			for(int j=0; j<(i*2)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void shape4() {
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void shape5() {
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--)
			System.out.print("*");
			System.out.println();
		}
	}
}

