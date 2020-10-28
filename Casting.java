import java.net.Proxy.Type;

public class Casting {
    public static void main(String[] args) {
        double a = 1.1;

        int b = (int) 1.1;
        System.out.println(b); // Casting 1

        // 1 to String
        int i = 1234;
        String str1 = Integer.toString(i);
        System.out.println(str1);
        System.out.println(str1.getClass()); // 타입
        System.out.println(str1.charAt(2)); // 자릿수
    }
