package chap04.sec02;

import java.util.Scanner;

public class ForStatementEx02 {

	public static void main(String[] args) {
		ForStatement2 fs = new ForStatement2();
//		fs.numberOfVowels();
//		fs.fibonacciNumber();
	}
}
	
class ForStatement2 {
	Scanner sc = new Scanner(System.in);
	
	//����6 Ű����� �ܾ �Է� �޾�
	//�ܾ ���Ե� ����(a, e, i, o, u)�� ���� ����Ͻÿ�.
	public void numberOfVowels() {
		int count = 0;
		
		System.out.print("�ܾ� �Է� : ");
		String word = sc.nextLine();
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||
					word.charAt(i)=='i'||word.charAt(i)=='o'||
					word.charAt(i)=='u') {
				count++;
			} 
		}
		System.out.println(word+"�� ���Ե� ������ ���� : "+count);
	}
	
	//����7 1-50 ���̿� �����ϴ� fibonacci ������ ����Ͻÿ�.
	//fibonacci ���� : ù ���� �ι�° ���� 1�� �־�����
	//�� �������� �� ���� ���� 
	//������� �Ǵ� ���� => �ڷ� �˻� �˰��� ���(�ǳ볪ġ �˻�)
	public void fibonacciNumber() {
		int ppNum=1; //������
		int pNum=1;  //����
		int currNum=0; //�����
		System.out.printf("%3d%3d", ppNum, pNum);
		for(int i=1; i<=50; i++) {
			currNum=ppNum+pNum;
			if(currNum>=50) {
				break;
			} else {
				System.out.printf("%3d", currNum);
				ppNum=pNum;
				pNum=currNum;
				
			} 
		}
	}
	
}