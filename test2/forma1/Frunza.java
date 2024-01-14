package test2.forma1;

import java.util.Random;

public class Frunza {

    char forma;
    char[] tipFrunza = {'*', '#', '$', '@'};
    Random frunzaRandom = new Random();

    public Frunza() {
        this.forma = tipFrunza[(frunzaRandom.nextInt(4))];
    }

    public char getForma() {
        return forma;
    }

    public String toString() {
        return forma + "";
    }

}
