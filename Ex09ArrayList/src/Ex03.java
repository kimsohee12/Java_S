import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicGraphicsUtils;

public class Ex03 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		ArrayList<String> musiclist = new ArrayList<String>();
		int num ;
		//무조건 출력될거 
		String s ;
		
		//while(true)
		while (true) {
			System.out.print("[1]노래추가 [2] 노래삭제 [3] 종료 >> ");
			num = sc.nextInt();
			if(num==1) {
				printlist(musiclist);
				//1번일때 
				// 노래추가 위치 
				System.out.print("[1] 마지막 위치에 추가 [2] 원하는 위치에 추가 >> ");
				num =sc.nextInt();
				if(num==1) {
					System.out.print("추가 할 노래 입력 : ");
					sc.nextLine();
					musiclist.add(sc.nextLine());
					// nextLine -> 띄어쓰기 한 값도 출력 가능
					//공백문자도 기억후 처리함 ex(스페이스나 엔터키)
					// 공백문자 처리할수 있도록 한번더 입력 받아주면 처리 가능 
					System.out.println("추가가 완료 되었습니다.");
				}else {
					System.out.print("추가 할 노래 입력 : ");
					sc.nextLine();
					s=sc.next();
					System.out.print("추가 할 위치 입력 >> ");
					num =sc.nextInt();
					musiclist.add(num,s);
					System.out.println("추가가 완료 되었습니다.");
				}//노래 삭제 
			}else if (num==2) {
				//2번일때
				printlist(musiclist);
				System.out.print("[1] 선택삭제 [2] 전체삭제 >> ");
				num =sc.nextInt();
				if(num==1) {
					System.out.print("삭제할 노래 선택 : ");
					num =sc.nextInt();
					musiclist.remove(num-1);
					System.out.println("노래가 삭제되었습니다.");
				}else {
					musiclist.clear();
					System.out.println("전체 list가 삭제 되었습니다. ");
				}
				
			}else {//3번일때
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
					
	
		
		}
		
		
		
		
	}

	public static void printlist(ArrayList<String> musiclist) {
		System.out.println("=====현재 재생목록=====");
		if(musiclist.size()==0) {//재생목록 
			System.out.println("재생목록이 없습니다.");
		}else {
			for (int i = 0; i<musiclist.size();i++) {
				System.out.println(i+1 + ". " +musiclist.get(i));
			}
		}System.out.println("===================");
	}
		
	
}
