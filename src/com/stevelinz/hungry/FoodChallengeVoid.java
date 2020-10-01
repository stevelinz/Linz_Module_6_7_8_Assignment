package com.stevelinz.hungry;

class FoodChallengeVoid implements FoodChallengeStrategy {

    public String foodReality() {

        return
        "#     #        #     #\n"+
        "#     #   ##   #     #\n"+
        "#     #  #  #  #     #\n"+
        "####### #    # #######\n"+
        "#     # ###### #     #\n"+
        "#     # #    # #     #\n"+
        "#     # #    # #     #\n\n"+
        "No food here, naturally\n"+
        "\nI would challenge you to think more about where food might be.\n";

    }

}