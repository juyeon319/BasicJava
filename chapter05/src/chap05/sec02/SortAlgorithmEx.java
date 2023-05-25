package chap05.sec02;

public class SortAlgorithmEx {

	public static void main(String[] args) {
// 예제6) 다음 수를 배열에 저장하고 크기 순으로 정렬하시오.
//		  자료 : 35, 80, 25, 69, 44, 51, 89, 97
		
// Bubble Sort : 인접된 두 자료의 크기를 비교하여 자리를 교환
//				  자료가 m개일 때 m-1 회전수행
		int[] source = {35, 80, 25, 69, 44, 51, 89, 97};
		SortAlgorithm sa = new SortAlgorithm();
		sa.bubbleSort(source);
	}
}

class SortAlgorithm {
 	
 	public void bubbleSort(int[] target) {
 		boolean flag = false;
 		int cnt = 0;
 		//각 회전
 		for(int i=0; i<target.length-1; i++) {
 			flag = false;
 			cnt++;
 			//한 행에서 비교
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
 		System.out.println("수행횟수 : " + cnt);
 		for(int i=0; i<target.length; i++) {
 			System.out.printf("%5d",target[i]);
 		}
	}
}