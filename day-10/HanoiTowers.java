/**
 * Ex 2 - Day 10 Classics
 *
 * 2.3 c) Hanoi towers
 *
 * A legend says that, somewhere in the East, near Hanoi, there is a temple.
 * In the temple, there are three posts. In the posts, there are 64 discs of 64
 * different sizes. When the world was created, all the discs were in the first
 * post; when all the discs are moved to the last post, the world will end.
 * The monks in the temple move the discs between posts, but they must obey two
 * simple rules. First, only one disc can be moved at a time, from one post to
 * another post (it cannot be left anywhere else). Last, but not least, a disc
 * can only be placed on top of a bigger disc, never on top of a smaller disc.
 * The smallest disc can be placed on any post (all other discs are bigger);
 * the biggest disc can only be placed on an empty post.
 * Create a method that calculates the number of moves necessary to move a set
 * of n Hanoi disks from the initial post to the last post. Hint: if you want to
 * play monk yourself in order to better understand the problem, ask the
 * lecturer for a “Hanoi envelope”.
 */

public class HanoiTowers {
    // I know I need twice the number of moves of the precedent + 1
    // Eg. I need   1 move to move 1 disc (n)
    //              3 moves to move 2 discs (2n + 1 of the previous move)
    //              7 moves to move 3 discs (2n + 1 of the previous move)
    //              15 moves to move 4... etc.

    private long count = 1;
    private long disc;
    private long moves = 3;

    public long movingDiscs(long disc) {
        if (disc == 1) {
            moves = 1;
            System.out.println("Moving " + disc + " disc - " + moves + " move");
        } else if (disc > 2) {
            // Calculate the number of moves needed

            moves = 2 * moves + 1;
            System.out.println(moves + " moves, disc = " + disc);
            movingDiscs(disc - 1);
        }

        return moves;
    }

    public static void main(String[] args) {
        HanoiTowers test = new HanoiTowers();
        test.launch();
    }

    public void launch() {
        movingDiscs(1);
        System.out.println("-------");
        movingDiscs(2);
        System.out.println("-------");
        movingDiscs(3);
        System.out.println("-------");
        movingDiscs(4);
        System.out.println("-------");
        movingDiscs(64);
    }
}
