package rpskata;

import static rpskata.GameResult.*;
import static rpskata.Throw.*;

public class Game {
    public static GameResult play(Throw p1Throw, Throw p2Throw) {
        if(p1Throw == null || p2Throw == null) {
            return INVALID;
        }
        if (p1Throw == p2Throw) {
            return TIE;
        }
        if (p1Throw == ROCK && p2Throw == SCISSORS
                || p1Throw == SCISSORS && p2Throw == PAPER
                || p1Throw == PAPER && p2Throw == ROCK) {
            return P1_WINS;
        } else {
            return P2_WINS;
        }
    }
}
