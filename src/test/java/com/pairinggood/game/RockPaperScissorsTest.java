package com.pairinggood.game;

import org.junit.Test;

import static com.pairinggood.game.RockPaperScissors.*;
import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    private final RockPaperScissors game = new RockPaperScissors();

    @Test
    public void play_RockThenScissors_RockBeatsScissors() {
        assertEquals(ROCK, game.play(ROCK, SCISSORS));
    }

    @Test
    public void play_ScissorsThenRock_RockBeatsScissors() {
        assertEquals(ROCK, game.play(SCISSORS, ROCK));
    }

    @Test
    public void play_PaperThenScissors_ScissorsBeatPaper() {
        assertEquals(SCISSORS, game.play(PAPER, SCISSORS));
    }

    @Test
    public void play_ScissorsThenPaper_ScissorsBeatPaper() {
        assertEquals(SCISSORS, game.play(SCISSORS, PAPER));
    }

    @Test
    public void play_PaperThenRock_PaperBeatsRock() {
        assertEquals(SCISSORS, game.play(SCISSORS, PAPER));
    }
}
