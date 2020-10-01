package com.stevelinz.hungry;

public class Office extends Location {

    public Office(){
        super();
        System.out.println("\nUsually salt and pepper found here " +
                "for the meals I eat in the office.\n");
        foodChallengeStrategyOutcome = new FoodChallengeVoid();
    }
}