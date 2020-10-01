package com.stevelinz.hungry;

import java.io.*;
import java.util.Scanner;

public class SingletonPlayerName {

    private static SingletonPlayerName instance = new SingletonPlayerName();

    private SingletonPlayerName(){}

    public static SingletonPlayerName getInstance(){
        return instance;
    }

    public void playerCreate() throws IOException {

        FileWriter fW = new  FileWriter("player.txt",false);
        PrintWriter outFile = new PrintWriter(fW);
        outFile.flush();
        Scanner kB = new Scanner(System.in);
        System.out.print("Enter The Player Name you want ");
        String playerName = kB.nextLine();
        while (playerName.length()>64 || playerName.length()<2)
        {
            System.out.print("Enter The Player Name you want " +
                    "(but not so long or short)");
            playerName = kB.nextLine();
            break;
        }
        outFile.println(playerName);
        outFile.close();
    }

    public String playerRead() throws FileNotFoundException {

        File nameRead = new File("player.txt");
        Scanner name = new Scanner(nameRead);
        String nameSent = null;

        while (name.hasNextLine())
        {
            nameSent = name.nextLine();
        }
        return nameSent;

    }

}
