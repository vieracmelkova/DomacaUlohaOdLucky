import java.util.Scanner;

public class KupaAuta11 {
    //Vytvor funkciu, ktorá načíta cenu automobilu a priemerú výšku sumy,
    // ktorú môžeme mesačne na auto odložiť. Aplikácia vypíše, že je auto lacné,
    // ak si naň dokážeme našetriť do roka a pol vrátane. Inak vypíše, že je auto drahé.

    static void kupaAuta(int fCena, int fMesSporenie) {
        int fNasetrene = 0;
        fNasetrene = (18 * fMesSporenie);

        if (fNasetrene >= fCena) {
            System.out.println("Auto je lacne.");
        } else {
            System.out.println("Auto je drahe.");
        }
    }

    public static void main(String[] args) {

        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Cena auta je: ");
        int cena = mojObjekt.nextInt();

        System.out.println("Priemerna vyska sumy, ktoru mozeme na auto mesacne odlozit je: ");
        int mesSporenie = mojObjekt.nextInt();

        kupaAuta(cena,mesSporenie);

    }
}
