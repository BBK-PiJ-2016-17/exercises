package linkedLists;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
 
        String[] platform1 = {"PS4"};
        String[] platform2 = {"3DS", "Wii U"};
        VideoGameArray game1 = new VideoGameArray("Battlefield 1", 2001, "M",
                platform1);
        VideoGameArray game2 = new VideoGameArray("Pokemon Sun", 2016, "E", platform2);
        VideoGameArray game3 = new VideoGameArray("The Legend of Zelda", 2017, "E", platform2);
        
        ArrayList<VideoGameArray> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(0, game3);
        
        System.out.println(games);
    }
}
