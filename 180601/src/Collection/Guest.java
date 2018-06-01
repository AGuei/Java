package Collection;

import java.util.*;
import static java.lang.System.out;

public class Guest {
    public static void main(String[] args) {
    	SimpleLinkedList names = new SimpleLinkedList();
        collectNameTo(names);
        out.println("訪客名單：");
        printUpperCase(names); 
    }

    static void collectNameTo(SimpleLinkedList names) {
        Scanner console = new Scanner(System.in);
        while(true) {
            out.print("訪客名稱：");
            String name = console.nextLine();
            if(name.equals("quit")) {
                break;
            }
            names.add(name);
        }
    }

    static void printUpperCase(SimpleLinkedList names) {
        for(int i = 0; i < names.size(); i++) {
            String name = (String) names.get(i);
            out.println(name.toUpperCase());
        }        
    }
}
