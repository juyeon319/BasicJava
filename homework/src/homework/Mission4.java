package homework;

public class Mission4 {

	/*
	 * 5명이 3과목 시험을 본 결과가 다음과 같다. 
	 * 이를 배열 저장한 후 총점,평균,등수를 구한 후 등수순으로 출력하시오.(평균은 정수로)
	 * [자료] 
	 * 이름 국어 영어 수학 
	 * 홍길동 70 80 60 
	 * 이순신 80 90 90 
	 * 정몽주 90 80 90 
	 * 강감찬 75 80 80 
	 * 이성계 60 70 60
	 */
	
	public static void main(String[] args) {
		TwoDimArray td = new TwoDimArray();
//		td.getScore();
//		td.sumOfScore();
//		td.getRank();
		td.sortRank();
	}
}

/*예제1) 5명이 3과목 시험을 본 결과가 다음과 같다.
이를 배열 저장한 후 출력하시오.
[자료]
	 이름 	국어	영어	수학
	홍길동 	 70	 80	 60
	이순신	 80	 90	 90 
	정몽주 	 90	 80	 90
	강감찬  	 75	 80	 80
	이성계	 60	 70	 60 */

class TwoDimArray {
	private String[] name = {"홍길동", "이순신", "정몽주", "강감찬", "이성계"};
	
	public void getScore() {
		int[][] score = {{70,80,60}, 
						{80,90,90}, 
						{90,80,90}, 
						{75,80,80}, 
						{60,70,60}};
		System.out.println("          **** 성적표 ****");
		System.out.println("-----------------------------");
		System.out.println("이  름     국어      영어      수학");
		System.out.println("-----------------------------");
		
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i] + " ");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%6d", score[i][j]);
			}
			System.out.println();
		}
	}
	
//	예제2) 위 자료를 이용하여 총점과 평균(정수)을 구하시오.
	public void sumOfScore() {
		int[][] score = {
				{70,80,60,0,0}, 
				{80,90,90,0,0}, 
				{90,80,90,0,0}, 
				{75,80,80,0,0}, 
				{60,70,60,0,0}
				};
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<3; j++) {
				score[i][3]=score[i][3]+score[i][j]; //총점
			} 
			score[i][4]=score[i][3]/3; //평균
		}
		System.out.println("            **** 성적표 ****");
		System.out.println("----------------------------------");
		System.out.println("이  름     국어     영어      수학      총점      평균");
		System.out.println("----------------------------------");
		printScore(score);
	}
	
//	예제3) 위 자료를 이용하여 총점과 평균 및 석차(등수)를 구하시오.
	public void getRank() {
		int[][] score = {
				{70,80,60,0,0,1}, 
				{80,90,90,0,0,1}, 
				{90,80,90,0,0,1}, 
				{75,80,80,0,0,1}, 
				{60,70,60,0,0,1}
				};
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<3; j++) {
				score[i][3]=score[i][3]+score[i][j]; //총점
			} 
			score[i][4]=score[i][3]/3; //평균
		}
		
		//등수
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}
		}
		System.out.println("             **** 성적표 ****");
		System.out.println("-----------------------------------------");
		System.out.println("이  름     국어     영어      수학      총점      평균      등수");
		System.out.println("-----------------------------------------");
		
		printScore(score);
	}

	//출력
	public void printScore(int[][] score) {
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i] + " ");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%6d", score[i][j]);
			}
			System.out.println();
		}
	}
	
	//등수순으로 출력하시오.
	public void sortRank() {
		int[][] score = {
				{70,80,60,0,0,1}, 
				{80,90,90,0,0,1}, 
				{90,80,90,0,0,1}, 
				{75,80,80,0,0,1}, 
				{60,70,60,0,0,1}
				};
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<3; j++) {
				score[i][3]=score[i][3]+score[i][j]; //총점
			} 
			score[i][4]=score[i][3]/3; //평균
		}
		
		//등수
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}
		}
		
		//Sort
		for(int i=0; i<score.length-1; i++) {
	        for(int j=0; j<score.length-i-1; j++) {
	            if(score[j][5] > score[j+1][5]) {
	                int[] temp = score[j];
	                score[j] = score[j+1];
	                score[j+1] = temp;
	            }
	        }
	    }
		
		System.out.println("             **** 성적표 ****");
	    System.out.println("-----------------------------------------");
	    System.out.println("이  름     국어     영어      수학      총점      평균      등수");
	    System.out.println("-----------------------------------------");

	    printScore(score);
	}
}

