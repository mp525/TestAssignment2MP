package dk.test.stringtestass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BowlingStepDefs {

    private Game game;
    private int score;

    @Given("a bowling game <game>")
    public void a_bowling_game_game() {
        game = new Game();
    }
    @When("a player rolls 2 times and knocks over {int} and {int}")
    public void a_player_rolls_times_and_knocks_over_and(Integer pins1, Integer pins2) {
        game.roll(pins1);
        game.roll(pins2);
        score = game.score();
    }
    @Then("the score is {int}")
    public void the_score_is(Integer expected) {
        assertEquals(expected, score);
    }

    @Given("a bowling game")
    public void a_bowling_game() {
        game = new Game();
    }
    @When("a player completes a game with rolls and scores {int}, {int}, {int}, {int}, {int}, {int}, {int}, {int}, {int}, {int}")
    public void a_player_completes_a_game_with_rolls_and_scores(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6, Integer int7, Integer int8, Integer int9, Integer int10) {
        game.roll(int1);
        game.roll(int2);
        game.roll(int3);
        game.roll(int4);
        game.roll(int5);
        game.roll(int6);
        game.roll(int7);
        game.roll(int8);
        game.roll(int9);
        game.roll(int10);
    }
    @Then("final score {int} is calculated")
    public void final_score_is_calculated(Integer int1) {
        assertTrue(int1 == game.score());
    }
}
