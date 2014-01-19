package main;

/**
 * Created by myself on 19.01.14.
 */
public class GameStatus {


    public int getPlayerWeapon() {
        return playerWeapon;
    }

    public int getComputerWeapon() {
        return computerWeapon;
    }

    public void setPlayerWeapon(int playerWeapon) {
        this.playerWeapon = playerWeapon;
    }

    public void setComputerWeapon(int computerWeapon) {
        this.computerWeapon = computerWeapon;
    }

    private int playerWeapon;
    private int computerWeapon;


}
