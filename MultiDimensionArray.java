package Arrays;

public class MultiDimensionArray {
	public static void main(String [] args) {
		int rows = 5;
		int cols = 6;
		int arr[][] = new int[rows][cols];
		for(int i=1;i<=arr.length;i++) {
			for(int j=1;j<=arr[0].length;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
