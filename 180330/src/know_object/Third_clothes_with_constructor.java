package know_object;

class Clothes2 {
    String color;
    char size;
    Clothes2(String p1, char p2) {
        color = p1;
        size = p2;
    }
}

public class Third_clothes_with_constructor {
    public static void main(String[] args) {
        Clothes2 sun = new Clothes2("red", 'S');
        Clothes2 spring = new Clothes2("green", 'M');
        
        System.out.printf("sun (%s, %c)%n", sun.color, sun.size);
        System.out.printf("spring (%s, %c)%n", spring.color, spring.size);
    }
}
