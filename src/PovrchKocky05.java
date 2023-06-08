import java.util.Scanner;

public class PovrchKocky05 {
    // naprogramuj funkciu, ktora načíta stranu kocky a vrati veľkosť jej povrchu.

    static int velkostPovrchu (int fa) {
       int Povrch = 0;

       Povrch = 6 * fa * fa;

       return Povrch;
    }

    public static void main(String[] args) {
        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Zadaj velkost strany kocky: ");
        int a = mojObjekt.nextInt();

        System.out.println("Velkost povrchu kocky je: " + velkostPovrchu(a));
    }
}
