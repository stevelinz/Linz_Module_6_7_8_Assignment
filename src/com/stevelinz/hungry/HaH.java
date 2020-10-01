package com.stevelinz.hungry;

import java.io.IOException;
import java.util.Scanner;

public class HaH {
    static int counter = 1;

    public static void useAssets(Acquisition acquisition) {
        acquisition.displayAcquisition();
    }

    public static void main(String[] args) throws IOException {


        SingletonPlayerName singletonPlayerName = SingletonPlayerName.getInstance();

        System.out.println("Would you like to see the [S]LASH screen, " +
                "[C]HANGE Player Name or just play (any other key)? ");
        Scanner kb = new Scanner(System.in);
        String question = kb.next();
        if (question.equalsIgnoreCase("c")||
                question.equalsIgnoreCase("CHANGE")) {
            singletonPlayerName.playerCreate();
            playTheGame();
        } else if
        (question.equalsIgnoreCase("s") ||
                question.equalsIgnoreCase("SPLASH")) {
            Splash splash = new Splash();
            splash.splash();
            playTheGame();
        }
        else{
            kb.nextLine();
            playTheGame();
        }
    }

    public static void playTheGame() {
        AcquisitionFactory acquisitionFactory = new AcquisitionFactory();
        Acquisition acquisition;
        Scanner kb = new Scanner(System.in);
        String selectLocation;
        System.out.println("What location do you want to visit next?\n");
        System.out.println(
                "[P]ORCH \t" +
                        "[C]ELLAR \t" +
                        "[K]ITCHEN\t" +
                        "[T]VROOM \t" +
                        "[B]EDROOM\t" +
                        "[O]FFICE \t" +
                        "[G]ARDEN");
        selectLocation = kb.nextLine();
        System.out.println("Moves taken: " + counter);
        counter++;
        Existence existence = new Existence();
        String typeOfAsset;
        switch (selectLocation) {
            case "p":
            case "P":
            case "PORCH":
                Location porch = new Porch();
                System.out.println(porch.foodDiscovery());
                existence.death();
                break;
            case "c":
            case "C":
            case "CELLAR":
                Location cellar = new Cellar();
                System.out.println(cellar.foodDiscovery());
                existence.death();
                typeOfAsset = "C";
                acquisition =acquisitionFactory.makeAssets(typeOfAsset);
                useAssets(acquisition);
                break;
            case "k":
            case "K":
            case "KITCHEN":
                Location kitchen = new Kitchen();
                System.out.println(kitchen.foodDiscovery());
                typeOfAsset = "G";
                acquisition =acquisitionFactory.makeAssets(typeOfAsset);
                useAssets(acquisition);
                existence.death();
                break;
            case "t":
            case "T":
            case "TVROOM":
                Location tvRoom = new TvRoom();
                System.out.println(tvRoom.foodDiscovery());
                existence.death();
                break;
            case "b":
            case "B":
            case "BEDROOM":
                Location bedroom = new BedRoom();
                System.out.println(bedroom.foodDiscovery());
                existence.death();
                break;
            case "o":
            case "O":
            case "OFFICE":
                Location office = new Office();
                System.out.println(office.foodDiscovery());
                existence.death();
                break;
            case "g":
            case "G":
            case "GARDEN":
                Location garden = new Garden();
                System.out.println(garden.foodDiscovery());
                typeOfAsset = "F";
                acquisition =acquisitionFactory.makeAssets(typeOfAsset);
                useAssets(acquisition);
                existence.death();
                break;

            default:
                System.out.println("Something went wrong, try again");
                playTheGame();
                break;
        }
            playTheGame();
        }



    }






