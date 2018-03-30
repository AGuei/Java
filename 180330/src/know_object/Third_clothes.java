package know_object;

class Clothes {
    String color;
    char size;
}

public class Third_clothes {
    public static void main(String[] args) {

        Clothes sun = new Clothes();
        Clothes spring = new Clothes();
        Clothes winter = new Clothes();
    	
        sun.color = "red";
        sun.size = 'S';        
        spring.color = "green";
        spring.size = 'M';
        winter.color = "black";
        winter.size = 'L';
        
        System.out.printf("sun (%s, %c)%n", sun.color, sun.size);
        System.out.printf("spring (%s, %c)%n", spring.color, spring.size);
        System.out.printf("winter (%s, %c)%n", winter.color, winter.size);
    }
}