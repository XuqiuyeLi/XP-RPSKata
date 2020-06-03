package rpskata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static rpskata.Game.*;
import static rpskata.GameResult.*;
import static rpskata.Throw.*;

public class RPSTest {
    @Test
    public void rockVsScissors() {
        assertEquals(P1_WINS, play(ROCK, SCISSORS));
    }

    @Test
    public void scissorVsRock() {
        assertEquals(P2_WINS, play(SCISSORS, ROCK));
    }

    @Test
    public void scissorVsPaper() {
        assertEquals(P1_WINS, play(SCISSORS, PAPER));
    }

    @Test
    public void paperVsScissors() {
        assertEquals(P2_WINS, play(PAPER, SCISSORS));
    }

    @Test
    public void paperVsRock() {
        assertEquals(P1_WINS, play(PAPER, ROCK));
    }

    @Test
    public void rockVsPaper() {
        assertEquals(P2_WINS, play(ROCK, PAPER));
    }

    @Test
    public void rockVsRock() {
        assertEquals(TIE, play(ROCK, ROCK));
    }

    @Test
    public void paperVsPaper() {
        assertEquals(TIE, play(PAPER, PAPER));
    }

    @Test
    public void scissorsVsScissors() {
        assertEquals(TIE, play(SCISSORS, SCISSORS));
    }

    @Test
    public void rockVsNull() { assertEquals(INVALID, play(ROCK, null)); }

    @Test
    public void nullVsRock() {
        assertEquals(INVALID, play(null, ROCK));
    }
}
