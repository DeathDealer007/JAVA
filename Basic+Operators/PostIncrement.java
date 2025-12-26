public class PostIncrement {
    public static void main(String[] args) {
        int a = 10;
        --a;
        int b = --a + ++a + a;
        int c = a++ - ++b - --a - a;
        a = c-- + --b - c++ + c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        
    }
}
