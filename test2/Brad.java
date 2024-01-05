package test2;

import test2.forma1.Copac;

import java.util.Random;

public class Brad extends Copac {
    int inaltimeCoroana, varsta;
    Random rand = new Random();
    String xUri = "";
    int linii;
    char[] tipFrunza = {'*', '#', '$', '@'};
    int numarFrunze;


    public Brad(int inaltimeCoroana, int varsta) {
        this.inaltimeCoroana = inaltimeCoroana;
        this.varsta = varsta;
        for (int i = 0; i < inaltimeCoroana + 1; i++) {
            for (int j = inaltimeCoroana; j > 0; j--) {

            }
            linii = i;
        }
        this.numarFrunze = inaltimeCoroana * inaltimeCoroana;
    }

    public void afiseaza() {

        for (int i = 0; i < inaltimeCoroana + 1; i++) {
            for (int j = inaltimeCoroana - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print(tipFrunza[rand.nextInt(4)]);

                } else {
                    System.out.print(tipFrunza[rand.nextInt(4)]);

                }
            }
            System.out.println();
            linii = i;
        }
        for (int i = 1; i <= linii - 1; i++) {
            xUri = xUri + " ";
        }
        for (int i = 1; i <= linii - 1; i++) {
            if (i == (linii / 2)) {
                for (int x = 1; x <= 3; x++) {
                    System.out.print(xUri);
                    System.out.print('X');
                    System.out.println();
                }
            }
        }
    }

    public int getNumarFrunze() {
        return numarFrunze;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getInaltimeCoroana() {
        return inaltimeCoroana;
    }

    public int comparaCu(Copac deComparat) {
        if (deComparat instanceof Brad) {
            Brad totBrad = (Brad) deComparat;
            if (this.getNumarFrunze() > totBrad.getNumarFrunze()) {
                return 1;
            }
            if (this.getNumarFrunze() < totBrad.getNumarFrunze()) {
                return -1;
            } else {
                return 0;
            }
        }
        return -50;
    }

    @Override
    public String toString() {
        return "Brad cu " + this.getNumarFrunze() + " frunze " + "si " + this.getVarsta() + " ani";
    }

    public void sortareElemente(Copac[] copac) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (copac[j].comparaCu(copac[j + 1]) == -1) { // in functie de frunze
                    Copac aux = copac[j];
                    copac[j] = copac[j + 1];
                    copac[j + 1] = aux;
                }
                if ((copac[j].comparaCu(copac[j + 1]) == 0)) { // sortare in functie de varsta
                    if (copac[j].getVarsta() > copac[j + 1].getVarsta()) {
                        Copac aux = copac[j + 1];
                        copac[j + 1] = copac[j];
                        copac[j] = aux;
                    }
                    if (copac[j].getVarsta() < copac[j + 1].getVarsta()) {
                        Copac aux = copac[j];
                        copac[j] = copac[j + 1];
                        copac[j + 1] = aux;
                    }

                }
            }
        }
    }

}
