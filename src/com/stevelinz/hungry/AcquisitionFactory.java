package com.stevelinz.hungry;

public class AcquisitionFactory{

	public Acquisition makeAssets(String assetType){

		switch (assetType) {
			case "F":

				return new FarmAsset();

			case "G":

				return new GroceryAsset();

			case "C":

				return new CanFoodAsset();

			default:
				return null;
		}
		
	}
	
}