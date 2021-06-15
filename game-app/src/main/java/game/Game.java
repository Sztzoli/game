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


}
