package middleTest;

import java.util.Arrays;
import java.util.Scanner;

public class searchInArray {
	public static void main(String[] args) {
		int[] ary = {55,33,22};
		Arrays.sort(ary);
		Scanner console = new Scanner(System.in);
		System.out.printf("�п�J�n�M�䪺��ơG");
		int A = console.nextInt();
		System.out.printf("%d", Arrays.binarySearch(ary, A));
	}
}
