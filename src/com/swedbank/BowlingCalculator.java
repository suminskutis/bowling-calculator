package com.swedbank;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class BowlingCalculator {

    private int currentScore = 0;
    private int ballsLeft = 2;
    private int lastRoll = 0;
    private int currentRoll = 0;
    private int frameScore = 0;
    private List<Integer> framesScore = new ArrayList<>();
    private int frameCount = 0;

    public void roll(int score){
        currentRoll = score;
        countScore(currentRoll);
    }

    public void countScore(int currentRoll){

        if(lastRoll == 10){
            currentScore += currentRoll + currentRoll;

        }else {currentScore += currentRoll;
        }
        lastRoll = currentRoll;
    }

    public int getCurrentScore(){
        return currentScore;
    }

    public void setNewPlayerFrameScore(){
        for(int i = 0; i < 10; i++){
            framesScore.add(0);
        }
    }

    public List<Integer> getFramesScore() {
        return framesScore;
    }

    public void countFrameScore(){
    }


}
