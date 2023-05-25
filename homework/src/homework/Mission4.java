package homework;

public class Mission4 {

	/*
	 * 5���� 3���� ������ �� ����� ������ ����. 
	 * �̸� �迭 ������ �� ����,���,����� ���� �� ��������� ����Ͻÿ�.(����� ������)
	 * [�ڷ�] 
	 * �̸� ���� ���� ���� 
	 * ȫ�浿 70 80 60 
	 * �̼��� 80 90 90 
	 * ������ 90 80 90 
	 * ������ 75 80 80 
	 * �̼��� 60 70 60
	 */
	
	public static void main(String[] args) {
		TwoDimArray td = new TwoDimArray();
//		td.getScore();
//		td.sumOfScore();
//		td.getRank();
		td.sortRank();
	}
}

/*����1) 5���� 3���� ������ �� ����� ������ ����.
�̸� �迭 ������ �� ����Ͻÿ�.
[�ڷ�]
	 �̸� 	����	����	����
	ȫ�浿 	 70	 80	 60
	�̼���	 80	 90	 90 
	������ 	 90	 80	 90
	������  	 75	 80	 80
	�̼���	 60	 70	 60 */

class TwoDimArray {
	private String[] name = {"ȫ�浿", "�̼���", "������", "������", "�̼���"};
	
	public void getScore() {
		int[][] score = {{70,80,60}, 
						{80,90,90}, 
						{90,80,90}, 
						{75,80,80}, 
						{60,70,60}};
		System.out.println("          **** ����ǥ ****");
		System.out.println("-----------------------------");
		System.out.println("��  ��     ����      ����      ����");
		System.out.println("-----------------------------");
		
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i] + " ");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%6d", score[i][j]);
			}
			System.out.println();
		}
	}
	
//	����2) �� �ڷḦ �̿��Ͽ� ������ ���(����)�� ���Ͻÿ�.
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
				score[i][3]=score[i][3]+score[i][j]; //����
			} 
			score[i][4]=score[i][3]/3; //���
		}
		System.out.println("            **** ����ǥ ****");
		System.out.println("----------------------------------");
		System.out.println("��  ��     ����     ����      ����      ����      ���");
		System.out.println("----------------------------------");
		printScore(score);
	}
	
//	����3) �� �ڷḦ �̿��Ͽ� ������ ��� �� ����(���)�� ���Ͻÿ�.
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
				score[i][3]=score[i][3]+score[i][j]; //����
			} 
			score[i][4]=score[i][3]/3; //���
		}
		
		//���
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}
		}
		System.out.println("             **** ����ǥ ****");
		System.out.println("-----------------------------------------");
		System.out.println("��  ��     ����     ����      ����      ����      ���      ���");
		System.out.println("-----------------------------------------");
		
		printScore(score);
	}

	//���
	public void printScore(int[][] score) {
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i] + " ");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%6d", score[i][j]);
			}
			System.out.println();
		}
	}
	
	//��������� ����Ͻÿ�.
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
				score[i][3]=score[i][3]+score[i][j]; //����
			} 
			score[i][4]=score[i][3]/3; //���
		}
		
		//���
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
		
		System.out.println("             **** ����ǥ ****");
	    System.out.println("-----------------------------------------");
	    System.out.println("��  ��     ����     ����      ����      ����      ���      ���");
	    System.out.println("-----------------------------------------");

	    printScore(score);
	}
}

