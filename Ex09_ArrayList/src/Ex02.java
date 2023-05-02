import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();
		int num;
		String list ;
		
		while(true) {
			System.out.print( "[1] 노래 추가 [2] 노래 삭제 [3] 종료 >> ");
			num = sc.nextInt();
			if(num==1) {
				
			for(int i = 0 ; i< musiclist.size(); i++) {
				
				if(musiclist.size()==0) {
					System.out.println("재생 목록이 없습니다." + "\n================");
				}
				System.out.println("[1] 마지막 위치에 추가 [2] 원하는 위치에 추가 >>");
				num = sc.nextInt();
				if(num==1) {
					System.out.print("추가 할 노래 입력 : ");
					list =sc.next();
					musiclist.add(list);
					System.out.println("추가가 완료 되었습니다.");
					continue;
				}else {
					System.out.print("추가 할 노래 입력 : ");
					list =sc.next();
					System.out.print("추가 할 위치 입력 >> ");
					num =sc.nextInt();
					musiclist.add(num,list);
					System.out.println("추가가 완료 되었습니다.");
					continue;
				}
			}
		}
		
		}

		
		
		
		
	}

}
