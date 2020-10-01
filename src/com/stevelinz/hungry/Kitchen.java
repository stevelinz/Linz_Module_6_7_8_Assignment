package com.stevelinz.hungry;

public class Kitchen extends Location {

    public Kitchen(){
        super();
        foodChallengeStrategyOutcome = new FoodChallengeFound();
    }
}