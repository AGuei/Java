package know_object;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        int guess,count = 0;
        
        do {
            System.out.print("�q�Ʀr�]0 ~ 9�^:");
            guess = console.nextInt();
            if(guess > number){
            	System.out.println("�A�q�p�@�I");
            }
            else if(guess < number){
            	System.out.println("�A�q�j�@�I");
            }
            count++;
        } while(guess != number);
        
        System.out.println("�q���F...XD");
        System.out.printf("�@�q�F %d ��",count);
    }
}