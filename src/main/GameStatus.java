package main;

/**
 * Created by myself on 19.01.14.
 */
public class GameStatus {


    public int getPlayerWeapon() {
        return playerWeapon;
    }

    public void setPlayerWeapon(int playerWeapon) {
        this.playerWeapon = playerWeapon;
    }

    public int getComputerWeapon() {
        return computerWeapon;
    }

    public void setComputerWeapon(int computerWeapon) {
        this.computerWeapon = computerWeapon;
    }

    public String getWinner() {
        return winner;
    }

           //public void setWinner(String winner) {
           //     this.winner = winner;
           // }


    public void findWinner() {

        if (playerWeapon == 1 && computerWeapon == 3) {
            this.winner = String.valueOf(Outcome.YOU_WIN);
        }
        else if (playerWeapon == 2 && computerWeapon == 1) {
            this.winner = String.valueOf(Outcome.YOU_WIN);
        }
        else if (playerWeapon == 3 && computerWeapon == 2) {
            this.winner = String.valueOf(Outcome.YOU_WIN);
        }
        else if (playerWeapon == computerWeapon) {
            this.winner = String.valueOf(Outcome.DRAW);
        }
        else {
            this.winner = String.valueOf(Outcome.COMPUTER_WINS);
        }


    }

    private int playerWeapon;
    private int computerWeapon;

    private String winner;







}
