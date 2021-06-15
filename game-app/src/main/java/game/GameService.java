package game;

import java.util.ArrayList;
import java.util.List;

public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game biggestGoalDifference() {
        int maxDifference = 0;
        Game maxDiff = null;
        for (Game game : gameRepository.getGames()) {
            int difference = Math.abs(game.getFirstCountyScore()- game.getSecondCountyScore());
            if (difference > maxDifference) {
                maxDifference = difference;
                maxDiff = game;
            }
        }
        return maxDiff;
    }

//    public int sumGoalOfCountry(String country) {
//        int sum = 0;
//        for (Game game : gameRepository.getGames()) {
//
//        }
//    }



}
