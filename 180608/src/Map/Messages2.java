package Map;

import java.util.*;

public class Messages2 {
    public static void main(String[] args) {
        Map<String, String> messages = new TreeMap<>(); 
        messages.put("Justin", "Hello！Justin的訊息！");
        messages.put("Monica", "給Monica的悄悄話！");
        messages.put("Irene", "Irene的可愛貓喵喵叫！");
        System.out.println(messages);
    }
}
