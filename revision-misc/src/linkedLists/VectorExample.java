package linkedLists;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        
        String[] platform1 = {"PS4"};
        String[] platform2 = {"3DS", "Wii U"};
        VideoGameVector game1 = new VideoGameVector("Battlefield 1", 2001, "M",
                platform1);
        VideoGameVector game2 = new VideoGameVector("Pokemon Sun", 2016, "E", platform2);
        VideoGameVector game3 = new VideoGameVector("The Legend of Zelda", 2017, "E", platform2);
        
        Vector videoGames = new Vector();
        videoGames.add(game1);
        videoGames.add(game2);
        videoGames.add(game3);
        System.out.println(videoGames);
    }
}
