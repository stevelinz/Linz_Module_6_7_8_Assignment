package com.stevelinz.hungry;

public class Location {


    public FoodChallengeStrategy foodChallengeStrategyOutcome;


    public String foodDiscovery() {

        return foodChallengeStrategyOutcome.foodReality();

    }

}