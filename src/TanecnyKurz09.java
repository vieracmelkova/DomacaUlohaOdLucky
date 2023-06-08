import java.util.Scanner;

public class TanecnyKurz09 {
    //Zostav funkciu, ktorá načíta počet dievčat a počet chlapcov,
    // ktorí prišli na tanecny kurz a vypíše, či každé dievča bude mať partnera.

    static void porovnanie (int fpocetDievcat, int fpocetChlapcov) {
        if (fpocetDievcat <= fpocetChlapcov) {
            System.out.println("Kazde dievca bude mat tanecneho partnera.");
        } else {
            System.out.println("Nie vsetky dievcata budu mat tanecneho partnera.");
        }
    }

    public static void main(String[] args) {

        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Pocet dievcat: ");
        int pocetDievcat = mojObjekt.nextInt();

        System.out.println("Pocet chlapcov: ");
        int pocetChlapcov = mojObjekt.nextInt();

        porovnanie (pocetDievcat, pocetChlapcov);

    }
}
