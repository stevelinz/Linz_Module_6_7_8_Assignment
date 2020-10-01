package com.stevelinz.hungry;

import java.util.Random;

public class FarmAsset extends Acquisition {
	
	public FarmAsset(){

		System.out.println("THIS IS A FARM: (so to speak) " +
				"gather what you find you may be hungry later\n");

			String[] farmAssetCreator = {"beans", "mint", "tomatoes",
					"squash", "kale", "lettuce", "eggplant"};

			StringBuilder assetFarmReward = new StringBuilder();

			int i;
			Random rand = new Random();
			i = rand.nextInt(7);
		callRandom();
		for (int x = 0; x < i; x++) {
			assetFarmReward.append(farmAssetCreator[callRandom()]).append(" ");
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
	
