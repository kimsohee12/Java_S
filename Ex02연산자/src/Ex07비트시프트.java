
public class Ex07비트시프트 {

	public static void main(String[] args) {

		//비트 연산자, 시프트 연산자-> 연산을 빠르게 하고 싶을 때
		
		//비트 연산 : & (and), | (or)  , ^(xor) , ~(not)
		int b= 9;
		int c = 11;
		
		System.out.println(b&c);
		System.out.println(b|c);
		System.out.println(b^c);
		int d = 6;
		System.out.println(~d);
		
		//시프트 연산 : 비트(0,1)를 옮겨주는 연산
		//<<(비트가 왼족으로 옮겨짐), >>(비트가 오른쪽으로 옮겨짐)
		System.out.println(3<<2);
		//3(2진수) 비트를 왼쪽으로 2칸씩 움직인다
		
		
	}

}
