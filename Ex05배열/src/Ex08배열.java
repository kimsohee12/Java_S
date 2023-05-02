import java.util.Scanner;

public class Ex08배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id[] = new String[3];
		String pw[] = new String[3];
		int count = 0;
		int menu;
		String iD;
		String pW;
		while (true) { 
			System.out.println("1.회원가입 2.로그인 3.종료 ");
			menu = sc.nextInt();
			if (menu == 1) {
				if (count == 3) {
					System.out.println("가입인원 초과");
					continue;
				}
				System.out.print("===회원가입===" + "\n id입력 :");
				iD = sc.next();
				System.out.print("pw 입력 : ");
				pW = sc.next();
				id[count] = iD;
				pw[count] = pW;
				count++;
				System.out.println("가입성공");
			} else if (menu == 2) {
				System.out.print("===로그인===" + "\n id입력 :");
				iD = sc.next();
				System.out.print("pw 입력 : ");
				pW = sc.next();
				for (int i = 0; i < count; i++) {
					if (id[i].equals(iD) && pw[i].equals(pW)) {
						System.out.println("로그인 성공");
						break;
					} else {
						System.out.println("로그인 실패");
					}
				}
			} else if (menu == 3) {
				System.out.println("프로그램을 종료 합니다.");
				break;
			} else {
				System.out.println("다시 입력 해주세요");
			}

		}
	}
}
