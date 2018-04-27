package middleTest;

public class ex2 {
	public static void main(String[] args) {
		int[][] A = {
				{1,2},
				{3,4},
				{5,6}
		},
		B = {
				{2,3},
				{5,6},
				{8,9}
		},
		 C = {
				{0,0},
				{0,0},
				{0,0}
		};
		
		for(int i=0; i< A.length; i++){
			for(int j=0; j< A[i].length; j++){
				C[i][j] = A[i][j] - B[i][j];
			}
		}
		for(int[] row:C){
			for(int value : row){
				System.out.printf("%2d", value);
			}
			System.out.println();;
		}
	}
}
