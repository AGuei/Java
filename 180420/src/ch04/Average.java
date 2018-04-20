package ch04;

public class Average {
    public static void main(String[] args) {
        long sum = 0;
        for(String arg : args) {
            sum += Long.parseLong(arg);
        }
        System.out.println("¥­§¡¡G" + (float) sum / args.length);
    }
}
