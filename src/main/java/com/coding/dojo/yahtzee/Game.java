package com.coding.dojo.yahtzee;

import java.util.EnumMap;
import java.util.Map;

import static com.coding.dojo.yahtzee.Figures.MAXIMUM_DE_1;

/**
 * <h1></h1>
 */
public class Game {

    private Map<Figures, Integer> score;

    public Game() {
        this.score = new EnumMap<>(Figures.class);
    }

    public void newRoll(String roll, Figures figure) {
        this.score.put(MAXIMUM_DE_1, 3);
    }

    public void printScore() {
    }

    public Integer get(Figures figure) {
        return this.score.get(figure);
    }
}