import java.util.Scanner;
public class Autobus10 {
    //Vytvor funkciu, ktorá načíta počet ľudí v autobuse so 45 miestami na sedenie,
    // počet vystupujúcich a nastupujúcich na zastávke a zistí a vypíše,
    // či bude niekto v autobuse stáť alebo nie.

    static void autobus (int fuzCestuju, int fnastupili, int fvystupili) {
        int pocet = 0;
        pocet = (fuzCestuju + fnastupili - fvystupili);

        if (pocet <= 45) {
            System.out.println("V autobuse nemusi nikto stat.");
        } else {
            System.out.println("V autobuse musia niektori ludia stat.");
        }
    }

    public static void main(String[] args) {

        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Pocet uz cestujucich ludi: ");
        int uzCestuju = mojObjekt.nextInt();

        System.out.println("Pocet ludi, ktori nastupili: ");
        int nastupili = mojObjekt.nextInt();

        System.out.println("Pocet ludi, ktori vystupili: ");
        int vystupili = mojObjekt.nextInt();

        autobus(uzCestuju, nastupili, vystupili);
    }
}
