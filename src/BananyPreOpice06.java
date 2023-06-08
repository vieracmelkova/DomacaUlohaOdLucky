import java.util.Scanner;
public class BananyPreOpice06 {
    // naprogramuj funkciu, ktorá načíta koľko banánov zje opičia rodina za jeden deň a počet banánov,
    // ktoré chovateľ priviezol a vypíše, či bude stačiť toľko banánov na jeden týždeň

    static void pocetBananov (int fpotreba, int fzasoba) {
        if ((fpotreba * 7) <= fzasoba) {
            System.out.println("Pocet babanov opicej rodine na tyzden vystaci.");
        } else {
            System.out.println("Pocet babanov opicej rodine na tyzden nevystaci.");
        }
    }

    public static void main(String[] args) {
        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Zadaj potrebu bananov pre opiciu rodinu na jeden den: ");
        int potreba = mojObjekt.nextInt();

        System.out.println("Zadaj kolko bananov chovatel priviezol: ");
        int zasoba = mojObjekt.nextInt();

        pocetBananov(potreba, zasoba);
    }
}
