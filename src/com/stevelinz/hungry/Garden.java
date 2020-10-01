package com.stevelinz.hungry;

public class Garden extends Location {


    public Garden(){
        super();
        foodChallengeStrategyOutcome = new FoodChallengeGather();
    }
}