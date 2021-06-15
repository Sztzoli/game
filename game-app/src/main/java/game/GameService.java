package game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

    public int sumGoalOfCountry(String country) {
        int sum = 0;
        for (Game game : gameRepository.getGames()) {

        }
    }
    public Game biggestGoalDifference2() {
        Optional<Game> max = gameRepository.getGames().stream().max(Comparator.comparing(game -> Math.abs(game.difference())));
        if (max.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }
        return max.get();
    }






}
