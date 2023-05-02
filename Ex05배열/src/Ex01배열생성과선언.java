
public class Ex01배열생성과선언 {

	public static void main(String[] args) {

		int[] i = new int[6];
		i[0] = 3;
		i[1] = 10;
		i[2] = 15;
		i[3] = 20;
		i[4] = 34;
		i[5] = 34;
		
		int[] b = {2,4,6,8,10};
		
		for(int a = 0; a<=4; a++) {
			System.out.println(b[a]);
		}
		
		int[] intArray = new int[8];
		int[] myArray = intArray;
		intArray[1]=2;
		myArray[1]=6;
		System.out.println(intArray.length);
		
		
	}

}
