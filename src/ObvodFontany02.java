import java.util.Scanner;

public class ObvodFontany02 {

    // naprogramuj funkciu, ktorá načíta priemer kruhovej fontány
    // a vypíše jej obvod zaokrúhlený na dve desatinné miesta. Využi funkciu round.
    static double obvodFontany (double fdiameter) {
        double fperimeter = 0;
        double fperimeterPom = 0;

        fperimeterPom = (Math.round(2 * 3.14 * fdiameter * 100));
        fperimeter = fperimeterPom / 100;

        return fperimeter;
    }

    public static void main(String[] args) {

            Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

            System.out.println("Zadaj priemer fontany: ");
            double diameter = mojObjekt.nextDouble();

            System.out.println("Obvod fontany je: " + obvodFontany(diameter));
    }
}
