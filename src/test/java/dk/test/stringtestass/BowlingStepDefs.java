package dk.test.stringtestass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
