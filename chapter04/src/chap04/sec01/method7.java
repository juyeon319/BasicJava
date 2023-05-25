package chap04.sec01;

import java.util.Scanner;

public class method7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오.>>");
		int score = sc.nextInt();
		String grade = "";
		
		if(score>=90) {
			grade = "A";
			if(score>=97) {
				grade += "+";
			} else if(score>=93) {
				grade += "0";
			} else {
				grade += "-";
			}
		} else if(score>=80) {
			grade = "B";
			if(score>=87) {
				grade += "+";
			} else if(score>=83) {
				grade += "0";
			} else {
				grade += "-";
			}
			} else if(score>=70) {
			grade = "C";
			if(score>=77) {
				grade += "+";
			} else if(score>=73) {
				grade += "0";
			} else {
				grade += "-";
			}
			} else {
			grade = "F";
		} System.out.println(score+"==>"+grade);
	}
}