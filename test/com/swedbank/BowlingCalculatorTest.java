package com.swedbank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BowlingCalculatorTest {

    private List<Integer> framesScoreFake;
    BowlingCalculator bowlingCalculator;

    @Test
    public void testRoll() {
        BowlingCalculator bowlingCalculator = new BowlingCalculator();
        bowlingCalculator.roll(1);
    }


    @Test
    public void testFirstFrameScoreAfterTwoRolls(){
        BowlingCalculator bowlingCalculator = new BowlingCalculator();
        bowlingCalculator.roll(2);
        bowlingCalculator.roll(5);
        bowlingCalculator.getCurrentScore();
        assertTrue(bowlingCalculator.getCurrentScore() == 7);
    }

    @Test
    public void testStrikeAfterTwoRollsFirstRolls(){
        BowlingCalculator bowlingCalculator = new BowlingCalculator();
        bowlingCalculator.roll(10);
        bowlingCalculator.roll(3);
        bowlingCalculator.getCurrentScore();
        assertTrue(bowlingCalculator.getCurrentScore() == 16);
    }

    @Test
    public void isFramesScoreArrayEqualToZero(){
        framesScoreFake = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            framesScoreFake.add(0);
        }

        bowlingCalculator = new BowlingCalculator();
        bowlingCalculator.setNewPlayerFrameScore();
        assertTrue(framesScoreFake.equals(bowlingCalculator.getFramesScore()));
    }


    /*
    @Test
    public void testScoreAfterTwoRollsSpare(){
        BowlingCalculator bowlingCalculator = new BowlingCalculator();
        bowlingCalculator.roll(7);
        bowlingCalculator.roll(3);
        bowlingCalculator.getCurrentScore();
        assertTrue(bowlingCalculator.getCurrentScore() == 10);
    }
*/



     /* @Test
    public void testScoreAfterThreeRollsFirstTwoRollsWasSpare(){
        BowlingCalculator bowlingCalculator = new BowlingCalculator();
        bowlingCalculator.roll(7);
        bowlingCalculator.roll(3);
        bowlingCalculator.roll(5);
        bowlingCalculator.getCurrentScore();
        assertTrue(bowlingCalculator.getCurrentScore() == 20);
    }
*/

    /*
    @Test
    public void testBallCount(){
        BowlingCalculator bowlingCalculator = new BowlingCalculator();
        int ballsAtStart = 2;
        int ballsAfterOneRoll = 1;
        int ballsAfterTwoRolls = 0;
        bowlingCalculator.getBallsLeft();
        bowlingCalculator.roll(1);
        boolean afterOneRoll =
        bowlingCalculator.getBallsLeft();
        bowlingCalculator.roll(1);
        bowlingCalculator.getBallsLeft();
        assertTrue("Are there two balls at the satrt of a frame?", bowlingCalculator);

    }
    */
}