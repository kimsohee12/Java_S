import java.util.Scanner;

public class Ex05배열 {

	public static void main(String[] args) {

		 int []  score = new int[5];
		 Scanner sc = new Scanner(System.in);
		 
		 for(int i = 0 ; i < score.length; i++) {
			 System.out.print(i+1 +"번째 입력 >> ");
			 score[i] = sc.nextInt();
		 }
		 System.out.print("입력된 점수 : ");
		 //확장 for문 (for~each문)
		 //-> 배열, list구조에서 쓰일수 있는 반복문 
		 // for (자료형  + 배열 0번 인덱스에 있는 값부터 임시로 저장할 변수 : 배열의 레퍼런스 변수이름) { 
		 
		for (int a : score) {
			System.out.print(a + " ");
		}
		int max = score [0];
		int min = score [0];
		for (int a : score) {
			if(a>max) {
				max =a;
			}
			if(a<min) {
				min = a;
			}
		}
		double sum = 0;
		double avg = 0;
		for (int num : score) {
			sum += num;
			avg = sum/score.length;
		}
		System.out.println("\n최고 점수 : " + max + "\n최저 점수 : " + min);
		System.out.println("총 합 : " + (int)sum + "\n평균 : " + avg);
		
		
		
		
	}

}
