package com.stevelinz.hungry;

import java.util.Scanner;

class FoodChallengeGather implements FoodChallengeStrategy {

    public String foodReality() {

        questionChallenge();
        return "You have completed the Challenge.\n";

    }
    void questionChallenge(){
        System.out.println("\n\t\tPERCEPTION CHALLENGE\n");
        System.out.println("\nIsn't it so that: \n\nThere are TOO many people \n"+
                "\t\ttaking too many jobs away\n"+
                "\t\t\t\t\tfrom good machines?\n\n");
        System.out.println("\tHINT: The only right answer is [Y]ES\n");
        Scanner kB = new Scanner(System.in);
        String machine = kB.nextLine();

        while(!machine.equalsIgnoreCase(String.valueOf('y'))||
                machine.equalsIgnoreCase("yes")){
            System.out.println("\tHINT: The only right answer is [Y]ES\n");
            machine = kB.nextLine();

        }

    }

}


