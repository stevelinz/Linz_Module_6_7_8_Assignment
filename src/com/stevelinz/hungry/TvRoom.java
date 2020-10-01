package com.stevelinz.hungry;

    public class TvRoom extends Location {

        public TvRoom(){
            super();
            System.out.println("\nHum, Last night's popcorn, that's it!\n");

            foodChallengeStrategyOutcome = new FoodChallengeGather();
        }
    }

