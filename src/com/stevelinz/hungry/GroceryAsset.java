package com.stevelinz.hungry;

import java.util.Random;

public class GroceryAsset extends Acquisition {
	
	public GroceryAsset(){

		System.out.println("GROCERY ASSET: got stuff in refrigerator and table. \n"+
				"Use what you can now might be your last chance.");


	String[] groceryAssetCreator = {"Hamburger", "sausage", "red potatoes",
			"red onions", "Frozen Pizza", "frozen fish", "white potatoes"};

	StringBuilder assetFarmReward = new StringBuilder();

	int i;
	Random rand = new Random();
	i = rand.nextInt(7);
	callRandom();
		for (int x = 0; x < i; x++) {
		assetFarmReward.append(groceryAssetCreator[callRandom()]).append(" ");
	}
		System.out.println(assetFarmReward);
}

	public int callRandom(){
		int num;
		Random rand = new Random();
		num = rand.nextInt(7);
		return num;
	}

	
}