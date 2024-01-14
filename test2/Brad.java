package test2;

import test2.forma1.Copac;
import test2.forma1.Frunza;

public class Brad extends Copac {
    public int inaltimeaCoroanei, varsta, numarFrunze,linii;
    String xUri = "";

    public Brad(int inaltimeaCoroanei, int varsta) {
        this.inaltimeaCoroanei = inaltimeaCoroanei;
        this.varsta = varsta;
        numarFrunze = inaltimeaCoroanei * inaltimeaCoroanei;
    }


    public void afiseaza() {

        for (int i = 1; i < inaltimeaCoroanei + 1; i++) {
            for (int j = inaltimeaCoroanei - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print(new Frunza().getForma() + " ");

            }
            System.out.println();
            linii = i;
        }
        for (int i = 0; i < linii - 1; i++) {
            xUri = xUri + "  ";
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

    public int getNumarFrunze() {return numarFrunze;}
    public int getVarsta() {return varsta;}
    public int getInaltimeCoroana() {return inaltimeaCoroanei; }

    @Override
    public String toString() {
        return "Brad de inaltime:" + this.inaltimeaCoroanei + " varsta:" + this.varsta + " numarFrunze:" + this.numarFrunze;
    }
    
    @Override
    public int comparaCu(Copac deComparat) {
        if (deComparat instanceof Brad) {
            Brad totBrad = (Brad) deComparat;
            if (this.getNumarFrunze() > ((Brad) deComparat).getNumarFrunze())
                return 1;
            if (this.getNumarFrunze() < ((Brad) deComparat).getNumarFrunze())
                return -1;
            else
                return 0;
        }
        return 0;
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
