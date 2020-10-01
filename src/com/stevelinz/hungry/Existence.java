package com.stevelinz.hungry;

import java.util.Random;

public class Existence {

    public void death() {

        int num;

        Random rand = new Random();
        num = rand.nextInt(20 + 1);

            if (num == 6) {
                System.out.println("GAME OVER ");
                System.exit(3210);
            } else {
                System.out.println("Play on...");
            }
    }
}


