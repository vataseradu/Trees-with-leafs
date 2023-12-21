package test2.forma1;

import test2.Brad;

public class Comparabil extends Brad {
    public Comparabil(int inaltimeCoroana, int varsta) {
        super(inaltimeCoroana, varsta);
    }

    public void sortareElemente(Copac[] copac) {
        // Brad totBrad = (Brad) deComparat;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (copac[j].comparaCu(copac[j + 1]) == -1) {
                    Copac aux = copac[j];
                    copac[j] = copac[j + 1];
                    copac[j + 1] = aux;
                }
            }
        }
    }
}
