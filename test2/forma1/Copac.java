package test2.forma1;

public abstract class Copac {
    int varsta;

    public Copac(int varsta) {
        this.varsta = varsta;
    }

    public Copac() {
    }

    public abstract int comparaCu(Copac copac);

    public abstract void afiseaza();

    public abstract int getVarsta();

    public abstract void sortareElemente(Copac[] copac);

    public abstract int getInaltimeCoroana();

    public abstract int getNumarFrunze();


}
