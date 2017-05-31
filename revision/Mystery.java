public class Mystery {
    public int mystery(int n, int m, int p) {
        int i, result = 0;

        if (p == 0) {            return n + m;
        }
        for (i = 0; i < m; i++) {
            result += mystery(result, n, p - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Mystery test = new Mystery();

        System.out.println("\nn = 2, m = 1, p = 0\nResult: " + test.mystery(2, 1, 0));
        System.out.println("\nn = 2, m = 3, p = 1\nResult: " + test.mystery(2, 3, 1));
        System.out.println("\nn = 1, m = 3, p = 2\nResult: " + test.mystery(1, 3, 2));
    }
}