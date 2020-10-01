package com.stevelinz.hungry;

import java.util.Random;

public class CanFoodAsset extends Acquisition {

    public CanFoodAsset(){



        System.out.println("CAN FOOD ASSET: Shelves full. \n"+
                "Use what you can NOW might be your last chance.");


        String[] canFoodAssetCreator = {"Beans", "Hot sauce", "tuna",
                "tomato sauce", "salt", "corn"};

        StringBuilder assetCanFoodReward = new StringBuilder();

        int i;
        Random rand = new Random();
        i = rand.nextInt(6);
        callRandom();
        for (int x = 0; x < i; x++) {
            assetCanFoodReward.append(canFoodAssetCreator[callRandom()]).append(" ");
        }
        System.out.println(assetCanFoodReward);
    }

    public int callRandom(){
        int num;
        Random rand = new Random();
        num = rand.nextInt(6);
        return num;
    }
}

