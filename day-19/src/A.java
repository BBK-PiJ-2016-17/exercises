import java.util.concurrent.atomic.AtomicInteger;

public class A {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger();

        System.out.println(a.getAndDecrement());
    }
    
}