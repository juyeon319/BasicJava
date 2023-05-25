package chap05.sec03;

import java.util.Random;
import java.util.Scanner;

public class WordScambleEx {

	public static void main(String[] args) {
		WordScamble ws = new WordScamble();
		String str =ws.WordSelection(); //선택된 단어
		String question = ws.shuffle(str); //섞인 단어
		System.out.print("제시어 : " + question);
		ws.answer(str);
	}
}

/*
 예제1) 아래 단어 5개를 배열에 저장하고 
 임의의 단어를 선택한 후 단어 내의 철자를 섞어 사용자에서 제시한다. 
 사용자는 제시된 철자를
 보고 단어를 맞추는 게임(시도, 횟수도 출력할것) 
 제시어 : hope, apple, banana, orange, love
 */
class WordScamble {
	private String[] word = {"hope", "apple", "banana", "orange", "love"}; 
	
	public String WordSelection() {
		Random rnd = new Random();
		int idx = rnd.nextInt(5); //0~4사이에 정수형 난수 
		return word[idx]; //word에 idx번째 있는 단어를 반환해라
	}
	
	public String shuffle(String str) {
		char[] ch = str.toCharArray(); //문자열을 문자배열로 변환
		
		for(int i=0; i<1000; i++) {
			int r = (int)(Math.random()*ch.length);
			char temp = ch[0];
			ch[0] = ch[r];
			ch[r] = temp;
		}
		return(new String(ch)); //문자배열을 문자열로 반환 question으로 반환됨
	}
	
	public void answer(String question) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.print("\n정답 : ");
			String str = sc.nextLine();
			count++;
			
			if(str.equals(question)) {
				System.out.println("*******************");
				System.out.println("정답입니다......");
				System.out.println("시도횟수 : " + count);
				System.out.println("*******************");
			 break;
			} else {
				System.out.println("*******************");
				System.out.println("정답이 아닙니다......");
				System.out.println("*******************");
			}
		}
	}
}	

