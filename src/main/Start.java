package main;

import java.io.IOException;
import java.util.Scanner;


/**
 * Created by ilari on 18.01.14.
 */
public class Start {

    public static void main(String[] args) throws IOException {

       GameStatus gameStatus = new GameStatus();
       ComputerWeapon computerWeapon = new ComputerWeapon();


       Scanner in = new Scanner(System.in);
       System.out.println("1 for Rock");
       System.out.println("2 for Paper");
       System.out.println("3 for Scissors");
       System.out.println("Choose your Weapon: ");


       // Reads a integer from the console
       // and stores into playerWeapons variable in gameStatus
       gameStatus.setPlayerWeapon(in.nextInt());
       in.close();

       gameStatus.setComputerWeapon(computerWeapon.getComputerWeapon());

       gameStatus.findWinner();

       // Prints playerWeapon from gameStatus to the console
       System.out.println("Your Weapon: "+gameStatus.getPlayerWeapon());
       // Prints computerWeapon from gameStatus to the console
       System.out.println("Computer's Weapon: "+gameStatus.getComputerWeapon());

       System.out.print("And the winner is: "+gameStatus.getWinner());

    }

}


