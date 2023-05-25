package chap05.sec02;

public class SortAlgorithmEx {

	public static void main(String[] args) {
// ����6) ���� ���� �迭�� �����ϰ� ũ�� ������ �����Ͻÿ�.
//		  �ڷ� : 35, 80, 25, 69, 44, 51, 89, 97
		
// Bubble Sort : ������ �� �ڷ��� ũ�⸦ ���Ͽ� �ڸ��� ��ȯ
//				  �ڷᰡ m���� �� m-1 ȸ������
		int[] source = {35, 80, 25, 69, 44, 51, 89, 97};
		SortAlgorithm sa = new SortAlgorithm();
		sa.bubbleSort(source);
	}
}

class SortAlgorithm {
 	
 	public void bubbleSort(int[] target) {
 		boolean flag = false;
 		int cnt = 0;
 		//�� ȸ��
 		for(int i=0; i<target.length-1; i++) {
 			flag = false;
 			cnt++;
 			//�� �࿡�� ��
 			for(int j=0; j<target.length-1-i; j++) {
 				if(target[j]>target[j+1]) {
 					int temp = target[j];
 					target[j] = target[j+1];
 					target[j+1] = temp;
 					flag = true;
 				}
 			}
 			if(!flag) break;
 		}
 		System.out.println("����Ƚ�� : " + cnt);
 		for(int i=0; i<target.length; i++) {
 			System.out.printf("%5d",target[i]);
 		}
	}
}