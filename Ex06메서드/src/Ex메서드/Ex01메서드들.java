package Ex메서드;

public class Ex01메서드들 {

	public static void main(String[] args) {

		//String 관련된 메소드 모음
		
		//indexOf()
		//:특정 문자열/특정 문자의 위치를 반환
		
		String data = "여러분 안녕?";
		//"안"의 위치
		data.indexOf("안");//indexOf의 리턴값은 int->출력문 통해서 값을 확인할수 있음 
		System.out.println(data.indexOf("안"));
		//포함 하고있지 않다면 -1을 반환함 
		//-----------------------------
		
		//contains(String s) -> 값은 boolean으로 반환 
		//매개변수로 받은 문자열의 포함여부를 boolean으로 반환 
		
		System.out.println(data.contains("안녕?"));
		//안녕? 이라는 값을 포함하고 있으면 True 아니면 False 출력 
		//---------------------------------
		
		//chaeAt(int i)
		//String data 에서 i번째 문자를 반환 
		
		System.out.println(data.charAt(2));
		System.out.println(data.substring(1,5));
		//----------------------------
		
		//split (String s )
		//: String 변수를 s 변수 기준으로 잘라 배열로 반환
		
		String data2 = "010-2764-0296";
		String [] arr = data2.split("-");
		System.out.println(arr[1]);
		//자바 페스티벌에서 a가 몇명인지b가 몇명인지 문제 풀이에 사용 가능 
	}

}
