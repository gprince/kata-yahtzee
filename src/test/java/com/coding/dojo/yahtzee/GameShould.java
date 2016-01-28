package com.coding.dojo.yahtzee;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static com.coding.dojo.yahtzee.Figures.MAXIMUM_DE_1;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * <h1></h1>
 */
public class GameShould {

    @Test
    public void accept_new_roll_for_Maximum_de_1_if_no_score_is_already_registered_for_this_figure() {
        
        // given
        Game game = new Game();
        game.newRoll("1,1,1,3,5", MAXIMUM_DE_1);

        // when
        Integer maximunDe1 = game.get(MAXIMUM_DE_1);

        // then
        assertThat(maximunDe1, is(3));

    }
}