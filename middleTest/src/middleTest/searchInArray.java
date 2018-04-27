package middleTest;

import java.util.Arrays;
import java.util.Scanner;

public class searchInArray {
	public static void main(String[] args) {
		int[] ary = {55,33,22};
		Arrays.sort(ary);
		Scanner console = new Scanner(System.in);
		System.out.printf("請輸入要尋找的整數：");
		int A = console.nextInt();
		System.out.printf("%d", Arrays.binarySearch(ary, A));
	}
}
