package com.stevelinz.hungry;

public class Porch extends Location {

    public Porch(){
        super();
        System.out.println("\nLet's review the game instructions.\n");
        Splash splash = new Splash();
        splash.splash();
        foodChallengeStrategyOutcome = new FoodChallengeVoid();
    }
}