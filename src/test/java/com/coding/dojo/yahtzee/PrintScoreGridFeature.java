package com.coding.dojo.yahtzee;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static com.coding.dojo.yahtzee.Figures.*;

/**
 * <h1></h1>
 */
@RunWith(MockitoJUnitRunner.class)
public class PrintScoreGridFeature {

    @Mock
    Console console;

    private Game game;

    @Before
    public void initialise() {
        game = new Game();
    }

    @Test
    public void print_score_containing_the_complete_grid_with_total() {

        // given
        game.newRoll("1, 1, 1, 2, 4", MAXIMUM_DE_1);
        game.newRoll("2, 2, 2, 2, 5", MAXIMUM_DE_2);
        game.newRoll("3, 3, 1, 2, 4", MAXIMUM_DE_3);
        game.newRoll("4, 4, 4, 2, 5", MAXIMUM_DE_4);
        game.newRoll("5, 5, 5, 2, 4", MAXIMUM_DE_5);
        game.newRoll("6, 6, 6, 2, 4", MAXIMUM_DE_6);
        game.newRoll("3, 3, 3, 2, 4", BRELAN);
        game.newRoll("4, 4, 4, 4, 1", CARREE);
        game.newRoll("1, 1, 1, 2, 2", FULL);
        game.newRoll("1, 2, 3, 4, 1", PETITE_SUITE);
        game.newRoll("1, 2, 3, 4, 5", GRANDE_SUITE);
        game.newRoll("1, 5, 6, 1, 1", YAHTZEE);
        game.newRoll("4, 3, 2, 4, 5", CHANCE);

        // when
        game.printScore();

        // then
        final InOrder inOrder = Mockito.inOrder(console);
        inOrder.verify(console).print("---------------------");
        inOrder.verify(console).print("Joueur        |   1 |");
        inOrder.verify(console).print("---------------------");
        inOrder.verify(console).print("Maximum de 1  |   3 |");
        inOrder.verify(console).print("Maximum de 2  |   8 |");
        inOrder.verify(console).print("Maximum de 3  |   6 |");
        inOrder.verify(console).print("Maximum de 4  |  12 |");
        inOrder.verify(console).print("Maximum de 5  |  15 |");
        inOrder.verify(console).print("Maximum de 6  |  18 |");
        inOrder.verify(console).print("---------------------");
        inOrder.verify(console).print("Total         |  62 |");
        inOrder.verify(console).print("Prime         |   0 |");
        inOrder.verify(console).print("---------------------");
        inOrder.verify(console).print("Brelan        |   9 |");
        inOrder.verify(console).print("Carré         |  16 |");
        inOrder.verify(console).print("Full          |  25 |");
        inOrder.verify(console).print("Petite Suite  |  30 |");
        inOrder.verify(console).print("Grande Suite  |  40 |");
        inOrder.verify(console).print("Yahtzee       |   0 |");
        inOrder.verify(console).print("Prime Yahtzee |   - |");
        inOrder.verify(console).print("Chance        |  18 |");
        inOrder.verify(console).print("---------------------");
        inOrder.verify(console).print("Total         | 138 |");
        inOrder.verify(console).print("---------------------");
        inOrder.verify(console).print("Score final   | 200 |");
        inOrder.verify(console).print("---------------------");
    }
}