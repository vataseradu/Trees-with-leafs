package test2;

import test2.forma1.Copac;

import java.util.Random;

public class Teste {

    public static void main(String[] args) {
        Random rand = new Random();
        Copac[] copac = new Copac[6];
        int i = 0;
        while (i < 6) {
            copac[i] = new Brad(rand.nextInt(2, 10) + 1, rand.nextInt(1, 100) + 1);
            i++;
        }
        //i = 0;
        copac[0].sortareElemente(copac); // SORTARE + COMPARA CU
        System.out.println("------------------------");
        System.out.println("--------TOP BRAZI IN FUNCTIE DE FRUNZE SI VARSTA------- ");
        System.out.println("LOCUL 1 --- " + copac[0] + " cu " + copac[0].getInaltimeCoroana() + "m inaltimea coroanei");
        copac[0].afiseaza();
        System.out.println("------------------------------------------------");
        i = 1;
        int loc = 2;
        System.out.println("INTRE LOCUL 1 SI LOCUL 2 A FOST O DIFERENTA DE " + (copac[0].getNumarFrunze() - copac[1].getNumarFrunze()) + " FRUNZE");
        System.out.println();
        while (i < 6) {
            System.out.println("LOCUL " + loc + " --- " + copac[i] + "  // numar frunze="+copac[i].getNumarFrunze()+"  // inaltimea coroanei="+copac[i].getInaltimeCoroana());
            i++;
            loc++;
        }
    }
}
