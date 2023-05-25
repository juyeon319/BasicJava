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
	
	//예제6 키보드로 단어를 입력 받아
	//단어에 포함된 모음(a, e, i, o, u)의 수를 출력하시오.
	public void numberOfVowels() {
		int count = 0;
		
		System.out.print("단어 입력 : ");
		String word = sc.nextLine();
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||
					word.charAt(i)=='i'||word.charAt(i)=='o'||
					word.charAt(i)=='u') {
				count++;
			} 
		}
		System.out.println(word+"에 포함된 모음의 수는 : "+count);
	}
	
	//예제7 1-50 사이에 존재하는 fibonacci 수열을 출력하시오.
	//fibonacci 수열 : 첫 수와 두번째 수가 1로 주어지고
	//그 다음부터 두 수의 합이 
	//현재수가 되는 수열 => 자료 검색 알골리즘에 사용(피노나치 검색)
	public void fibonacciNumber() {
		int ppNum=1; //전전수
		int pNum=1;  //전수
		int currNum=0; //현재수
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