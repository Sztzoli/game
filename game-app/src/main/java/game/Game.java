package game;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

@Data
@AllArgsConstructor
public class Game {

    private String firstCounty;
    private String secondCounty;
    private int firstCountyScore;
    private int secondCountyScore;

    public static Game convertTo(String line) {
        String[] parts = line.split(";");
        return new Game(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
    }

    public String getWinnerName() {
        if (difference()>0) {
            return firstCounty;
        }
        if (difference()<0) {
            return secondCounty;
        }
        return "Draw";
    }

    public int difference() {
        return firstCountyScore-secondCountyScore;
    }
}
