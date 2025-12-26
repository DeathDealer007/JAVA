public class PreIncrement {
    public static void main (String [] args)
    {
        int a=-10;
        
        int b= - 5 + ++a;
        a= ++b + b - b + ++b;
        int c= ++a - ++b -10 + 5;
        b = ++a + ++c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
