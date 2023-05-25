package chap06.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class GradeEx {

	public static void main(String[] args) {
		Grade g1=new Grade();
		g1.setScore();
		g1.showScore();
	}
}

class Grade{
	private int[] score=new int[3];  
    private int sum;
    private double avg;
    
    public void setScore() {
    	Scanner sc=new Scanner(System.in);
        for(int i=0; i<3; i++){
           System.out.print("Á¡¼ö ÀÔ·Â : ");
           score[i]=Integer.parseInt(sc.nextLine());
           sum+=score[i];
        }
        avg=(double)sum/3;
    }
    
    public void showScore() {
    	System.out.println("Á¡¼ö : "+Arrays.toString(score));
        System.out.println("ÃÑÁ¡ : "+sum);
        System.out.println("Æò±Õ : "+avg);
    }
}
