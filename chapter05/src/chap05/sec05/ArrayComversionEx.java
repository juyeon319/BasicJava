package chap05.sec05;

public class ArrayComversionEx {
	
	public static void main(String[] args) {
		ArrayComversion ac = new ArrayComversion();
		ac.histogram();
		ac.oneToTwo();
	}
}
// 주사위를 50번 던져 나온 각각의 눈의 횟수를 구하고 이를 히스토그램으로 출력하시오.
// ex)
// 1 : ********(8)
// 2 : *********(9)
// 3 : **********(10)
// 4 : ********(8)
// 5 : *********(9)
// 6 : *******(7)

class  ArrayComversion {
	private int[] dice = new int [6]; //주사위 각 눈의 발생 횟수 저장
	
	public ArrayComversion() {
		for(int i=0; i<50; i++) {
			int rnd = (int)(Math.random()*6);
			dice[rnd]++;
		}
	}
	
	public void histogram() {
		for(int i=0; i<dice.length; i++) {
			System.out.print((i+1) + " : ");
			for(int j=0; j<dice[i]; j++) {
				System.out.print("*");
			}
			System.out.println("("+dice[i]+")");
		}
	}
	
	public void oneToTwo() {
		int rowCount = dice[0];
		for(int i=1; i<dice.length; i++) {
			if(rowCount<dice[i]) {
				rowCount = dice[i];
			} 
		}
		
		char[][] ch = new char[rowCount][6];
		for(int i=0; i<ch[0].length; i++) { //열
			for(int j=0; j<dice[i]; j++) {
				ch[j][i] = '*';
			}
		}
		System.out.println("\n\n");
		//출력
		for(int i=rowCount-1; i>=0; i--) {
			System.out.printf("%3d |",(i+1));
			for(int j=0; j<ch[i].length; j++) {
				System.out.printf("%5s", ch[i][j]);
			}
			System.out.println();
		}
		System.out.println("=====================================");
		System.out.println("         1    2    3    4    5    6");
	}
}
