import java.util.Scanner;

public class Ex06배열 {

	public static void main(String[] args) {
		// 배열 안에 들어있는 값이 중복되지 않는다(가정)
		
		String name[] = {"김지은", "박수현","정세연","이명훈","강예진","임명진","정형","채수민"};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 이름 입력 >> ");
		
		String inputName = sc.next(); 
		
		for(int i = 0 ; i <name.length; i++) {
			if(name[i].equals(inputName)) {
				System.out.println(inputName + "님은 "+ i + "번째 인덱스에 저장되어 있습니다.");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
