/**
 * Q8 2015
 */
public class Encode {

    // This doesn't compile
//    public static String encode(String source, String from, String to) {
//        for (char c : source.toCharArray()) {
//            System.out.println(c);
//            for(int i = 0; i < from.length(); i++) {
//                if (source.charAt(c) == from.charAt(i)) {
//                    System.out.println(c);
//                    c = to.charAt(i);
//                }
//            }
//            source += c;
//        }
//        return source;
//    }

    public static String encode(String source, String from, String to) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < source.length(); i++) {
            char changeLetter = source.charAt(i);
            for (i = 0; i < from.length(); i++) {
                if (changeLetter == from.charAt(i)) {
                    sb.append(to.charAt(i));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("Test", "e", "a"));
    }
}
