package chap05.sec03;

import java.util.Random;
import java.util.Scanner;

public class WordScambleEx {

	public static void main(String[] args) {
		WordScamble ws = new WordScamble();
		String str =ws.WordSelection(); //���õ� �ܾ�
		String question = ws.shuffle(str); //���� �ܾ�
		System.out.print("���þ� : " + question);
		ws.answer(str);
	}
}

/*
 ����1) �Ʒ� �ܾ� 5���� �迭�� �����ϰ� 
 ������ �ܾ ������ �� �ܾ� ���� ö�ڸ� ���� ����ڿ��� �����Ѵ�. 
 ����ڴ� ���õ� ö�ڸ�
 ���� �ܾ ���ߴ� ����(�õ�, Ƚ���� ����Ұ�) 
 ���þ� : hope, apple, banana, orange, love
 */
class WordScamble {
	private String[] word = {"hope", "apple", "banana", "orange", "love"}; 
	
	public String WordSelection() {
		Random rnd = new Random();
		int idx = rnd.nextInt(5); //0~4���̿� ������ ���� 
		return word[idx]; //word�� idx��° �ִ� �ܾ ��ȯ�ض�
	}
	
	public String shuffle(String str) {
		char[] ch = str.toCharArray(); //���ڿ��� ���ڹ迭�� ��ȯ
		
		for(int i=0; i<1000; i++) {
			int r = (int)(Math.random()*ch.length);
			char temp = ch[0];
			ch[0] = ch[r];
			ch[r] = temp;
		}
		return(new String(ch)); //���ڹ迭�� ���ڿ��� ��ȯ question���� ��ȯ��
	}
	
	public void answer(String question) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.print("\n���� : ");
			String str = sc.nextLine();
			count++;
			
			if(str.equals(question)) {
				System.out.println("*******************");
				System.out.println("�����Դϴ�......");
				System.out.println("�õ�Ƚ�� : " + count);
				System.out.println("*******************");
			 break;
			} else {
				System.out.println("*******************");
				System.out.println("������ �ƴմϴ�......");
				System.out.println("*******************");
			}
		}
	}
}	

