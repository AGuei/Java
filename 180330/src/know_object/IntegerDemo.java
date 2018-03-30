package know_object;

public class IntegerDemo {
    public static void main(String[] args) {
        Number wrapper1 = 10;
        Number wrapper2 = 20;
        
        System.out.println(20 / 3);
        System.out.println(wrapper1.doubleValue() / 3);
        System.out.println(wrapper1.intValue() / 3);
        System.out.println(wrapper1.equals(wrapper2));
    }
}
