import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex07배열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int answer[] = { 1, 4, 3, 2, 1 };
		int inputNum[] = new int[5];
		int score = 0;
		String check ="";
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(i + 1 + "번 답 >> ");
			inputNum[i] = sc.nextInt();
			if (answer[i] == inputNum[i]) {
				check+="O ";
				score += 20;
			} else {
				check +="X ";
			}
		}
		System.out.print("정답 확인\n" + check);
				System.out.println(" 총 점 : " + score);

	}

}
