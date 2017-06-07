/**
 * Q6 2015
 */
public class CharList {
    public static Node myList = new Node((char) 0, null);

    public static void main(String[] args) {
        for (String s : args) {
            for (int i = 0; i < s.length(); i++) {
                int c = Integer.parseInt(s.substring(i, i + 1));
                for (int n = c; n > 0; n--) {
                    myList.add(s.charAt(i));
                }
            }
        }

        for (Node nd = myList.getNext(); nd != null; nd = nd.getNext()) {
            System.out.println(nd.getContent() + " ");
        }

        System.out.println();
    }
}