package recursion;

public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        countdown(10);
    }

    public static void countdown(int num) {
        if(num == 0)
           System.out.println("Blast Off!");
        else {
            System.out.println(num);
            countdown(num - 1);
        }

    }
    
}
