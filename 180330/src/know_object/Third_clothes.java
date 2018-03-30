package know_object;

class Clothes {
    String color;
    char size;
    int price;
}

public class Third_clothes {
    public static void main(String[] args) {

        Clothes sun = new Clothes();
        Clothes spring = new Clothes();
        Clothes winter = new Clothes();
    	
        sun.color = "red";
        sun.size = 'S';        
        sun.price = 300;
        spring.color = "green";
        spring.size = 'M';
        spring.price = 250;
        winter.color = "black";
        winter.size = 'L';
        winter.price = 350;
        
        System.out.printf("sun (%s, %c, %d¤¸)%n", sun.color, sun.size, sun.price);
        System.out.printf("spring (%s, %c, %d¤¸)%n", spring.color, spring.size, spring.price);
        System.out.printf("winter (%s, %c, %d¤¸)%n", winter.color, winter.size, winter.price);
    }
}