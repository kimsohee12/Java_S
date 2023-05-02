import java.util.Random;

public class Ex04배열 {

	public static void main(String[] args) {

		Random rd = new Random();
		
		int arr[] = new int[8];
	
		
		for ( int i = 0; i<arr.length;i++) {
			arr[i] = rd.nextInt(20)+1;
			System.out.print(arr[i]+" ");
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0 ; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("\n가장 큰 값 : " + max );
		System.out.println("가장 작은 값 : " + min );
			
	
		
		
		
		
		
	}

}
