package chap04.sec02;

public class ForStatementEx03 {

	public static void main(String[] args) {
		ForStatement03 fs = new ForStatement03();
		System.out.println("[1�� ����]");
		fs.shape1();
		System.out.println("[2�� ����]");
 		fs.shape2();
 		System.out.println("[3�� ����]");
 		fs.shape3();
 		System.out.println("[4�� ����]");
 		fs.shape4();
 		System.out.println("[5�� ����]");
 		fs.shape5();
	}
}

class ForStatement03 {
	//����8 ������ ������ ����ϴ� ���α׷� �ۼ�
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

