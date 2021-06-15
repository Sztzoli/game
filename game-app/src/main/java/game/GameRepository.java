package game;

import lombok.Getter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Getter
public class GameRepository {

    private List<Game> games = new ArrayList<>();

    public void addGame(Game game) {
        games.add(game);
    }

    public void addGame(InputStream inputStream) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            reader.lines().map(Game::convertTo).forEach(games::add);
        } catch (IOException ioException) {
            throw new IllegalArgumentException("File cannot read", ioException);
        }
    }



}
