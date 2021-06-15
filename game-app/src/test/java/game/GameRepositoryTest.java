package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.*;

class GameRepositoryTest {

    GameRepository gameRepository;

    @BeforeEach
    void setUp() {
        gameRepository = new GameRepository();
    }

    @Test
    void addList() {
        Game game = new Game("Turkey", "Italy", 0, 3);
        gameRepository.addGame(game);

        assertThat(gameRepository.getGames())
                .hasSize(1)
                .extracting(Game::getFirstCounty, Game::getSecondCounty)
                .contains(tuple("Turkey", "Italy"));
    }

    @Test
    void assListFromCsv() {

        gameRepository.addGame("results.csv");

        assertThat(gameRepository.getGames())
                .isNotNull()
                .hasSize(15)
                .extracting(Game::getFirstCounty, Game::getSecondCounty)
                .contains(tuple("Turkey", "Italy"));
    }







}