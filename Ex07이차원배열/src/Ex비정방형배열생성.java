import java.util.Scanner;

public class Ex비정방형배열생성 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//비정방형배열 생성
		//1. 이차원 배열 레퍼런스 배열과 변수 생성 및 선언
		int [][] arr = new int [5][];
		//각 일차원 배열의 길이가 다르기 떄문에 레퍼런스 배열 생성시 
		//길이를 지정할수 없음-> 비워둠
		arr[0] = new int [1]; // 일차원배열 생성후 레퍼런스 값을 레퍼런스 배열에 저장
		arr[1] = new int [2];
		arr[2] = new int [3];
		arr[3] = new int [2];
		arr[4] = new int [1];
		
		arr [0][0] = 10;
		for (int i =0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.printf("%-3d", arr[i][j]);
			}
			System.out.println();
		}
		
		int [][] score = new int [4][];
		score[0] = new int [3];
		score[1] = new int [5];
		score[2] = new int [4];
		score[3] = new int [6];
		
		double sum = 0;
		double avg = 0;
		
		// 반별 점수 입력하기
		for (int i = 0; i<score.length; i++) {
			System.out.println(i+1+"반 점수 입력 ");
			for (int j =0; j<score[i].length; j++) {
				System.out.print( i+1 +"반 " + (j+1) + "번째 학생 점수 >> ");
				score[i][j] = sc.nextInt();
			}
		}
		System.out.println();// 반별 점수 출력 + 총점 + 평균 
		for (int i = 0; i<score.length; i++) {
			System.out.print( i+1 +"반 >> " );
			sum=0;
			for (int j =0; j<score[i].length; j++) {
			System.out.print( score [i][j] +" ");
			sum+=score[i][j];
			}
			System.out.println();
			avg = sum/score[i].length;
			System.out.print("\n총점 : " + (int)(sum) + " 평균 : " + avg);
			System.out.println();
		}
			
				
		
		
	}

}
