package com.stevelinz.hungry;
public class BedRoom extends Location {


    public BedRoom(){
        super();
        System.out.println("\nBedroom is for sleeping\n");
        foodChallengeStrategyOutcome = new FoodChallengeVoid();
    }
}