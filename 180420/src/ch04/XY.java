package ch04;

public class XY {
    public static void main(String[] args) {
        int[][] A = {
            {3, 4, 2},
            {1, 5, 7}
        }, B = {
            {-1, 3, 2},
            {4, 2, -3}
        },C = {
        	{0, 0, 0}, 
        	{0, 0, 0}
        };
        for(int x = 0; x < A.length; x++) {
            for(int y = 0; y < A[x].length; y++) {
            	C[x][y] = A[x][y] + B[x][y];
                System.out.printf("%2d", C[x][y]);
            }
            System.out.printf("\n");
        }
    }
} 