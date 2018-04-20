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

    	int x = 0;
        for(int[] row : C) {
        	int y=0;
        	for(int value : row) {
        		value = A[x][y] + B[x][y];
        		System.out.printf("%4d", value);
        		y++;
        	}
        	System.out.printf("\n");
        	x++;
        }
    }
} 