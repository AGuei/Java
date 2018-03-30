package know_object;

class Clothes2 {
    String color;
    char size;
    int price;
    Clothes2(String p1, char p2, int p3) {
        color = p1;
        size = p2;
        price = p3;
    }
}

public class Third_clothes_with_constructor {
    public static void main(String[] args) {
        Clothes2 sun = new Clothes2("red", 'S', 300);
        Clothes2 spring = new Clothes2("green", 'M', 250);
        Clothes2 winter = new Clothes2("black", 'L', 350);
        
        System.out.printf("sun (%s, %c, %d¤¸)%n", sun.color, sun.size, sun.price);
        System.out.printf("spring (%s, %c, %d¤¸)%n", spring.color, spring.size, spring.price);
        System.out.printf("spring (%s, %c, %d¤¸)%n", winter.color, winter.size, winter.price);
    }
}
