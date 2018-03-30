package know_object;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        int guess,count = 0;
        
        do {
            System.out.print("猜數字（0 ~ 9）:");
            guess = console.nextInt();
            if(guess > number){
            	System.out.println("再猜小一點");
            }
            else if(guess < number){
            	System.out.println("再猜大一點");
            }
            count++;
        } while(guess != number);
        
        System.out.println("猜中了...XD");
        System.out.printf("共猜了 %d 次",count);
    }
}