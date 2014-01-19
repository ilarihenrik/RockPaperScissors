package main;

/**
 * Created by ilari henrik aegerter on 19.01.14.
 */
public class ComputerWeapon {

    public int getComputerWeapon() {
        return computerWeapon;
    }

    private int MIN = 1;
    private int MAX = 3;

    private int computerWeapon = MIN + (int)(Math.random() * ((MAX - MIN) + 1));


    }

