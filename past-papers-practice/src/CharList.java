/**
 * Q6 2015
 */
public class CharList {
    public static Node myList = new Node((char) 0, null);

    public static void main(String[] args) {
        for (String s : args) {
            System.out.println("String length: " + s.length());
            for (int i = 0; i < s.length(); i++) {
                int c = Integer.parseInt(s.substring(i, i + 1));
                System.out.println("This is c inside the first for loop: " + c);
                for (int n = c; n > 0; n--) {
                    myList.add(s.charAt(i));
                    System.out.println("This is i inside the second for loop:" +
                            i);
                    System.out.println("This is n inside the second for loop:" +
                            n);
                }
            }
        }

        for (Node nd = myList.getNext(); nd != null; nd = nd.getNext()) {
            System.out.println(nd.getContent());
        }

        System.out.println();
    }
}