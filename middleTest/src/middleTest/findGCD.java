package middleTest;

import java.util.Scanner;
import java.util.regex.Pattern;

public class findGCD {

	public static void main(String[] args) {
		int inputA, inputB;
		Scanner console = new Scanner(System.in);
		System.out.printf("請輸入兩個整數：%n");
		inputA = console.nextInt();
		inputB = console.nextInt();		
		
		if(inputA < inputB){
			int temp = inputB;
		    inputB = inputA;
		    inputA = temp;
		}	
		while(inputB != 0){
			int t = inputA % inputB;
			inputA = inputB;
			inputB = t;
		}			
		System.out.println("最大公因數為：" + inputA);
	}	
}
