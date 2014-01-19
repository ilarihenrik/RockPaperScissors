package main;

import java.io.IOException;
import java.util.Scanner;


/**
 * Created by ilari on 18.01.14.
 */
public class Start {

    public static void main(String[] args) throws IOException {

       int playerWeapon;
       Scanner in = new Scanner(System.in);

       System.out.println("1 for Rock");
       System.out.println("2 for Paper");
       System.out.println("3 for Scissors");
       System.out.println("Choose your playerWeapon: ");

       // Reads a integer from the console
       // and stores into weapons variable
       playerWeapon=in.nextInt();
       in.close();

       // Prints playerWeapon to the console
       System.out.println("Your playerWeapon: "+playerWeapon);



       ComputerWeapon computerWeapon = new ComputerWeapon();
       System.out.println("Computer's Weapon: "+computerWeapon.getComputerWeapon());

    }

}


