public class Comparator {
    public static void main(String[] args) {
        Comparator c = new Comparator();

        System.out.println(c.getMax(5, 6));
        System.out.println(c.getMax("ciao", "test"));
        System.out.println(c.getMax("ciao", "testlungo"));
        System.out.println(c.getMax(7, 3));
    }
    public <T extends Comparable<T>> T getMax(T a, T b) {
        if (a.compareTo(b) > 0) return a;
        return b;
    }
}