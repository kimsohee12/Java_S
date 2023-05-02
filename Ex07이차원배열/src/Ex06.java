import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//replace 띄어쓰기 안한걸로 바꾸는
		// 대문자를 소문자로  toLowercase 
		//replace(" ","").toLowercase();
		//문자열(s)를 char로 쪼개야함 
		//charAt(index)--->아스키코드(int)
		
		int num[] = new int [26];
		System.out.print("입력 >> ");
		//nextLins();-> 엔터 칠때까지 문자열 리턴 / next() -> 스페이스 칠때까찌 문자열 리턴
		String s = sc.nextLine();
		s = s.replace(" ","").toLowerCase();
		for (int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);// s - a
			num [c-97]++;
			
		}
		for (int i = 0; i<num.length; i++) {
			System.out.println((char)(i+97) + " : " + num[i]);
		}
		
		
		
		
	}

}
