import java.util.Scanner;

public class PrevodJednotiek {
    //naprogramuj funkciu, ktora na vstupe dostane hmotnost v kg a vypise hmotnost v gramoch

    static double prevodMetoda (double fweightKg) {
        double fweightG = 0;

        fweightG = 1000 * fweightKg;

        return fweightG;
    }

    public static void main(String[] args) {

        Scanner mojObjekt = new Scanner(System.in); // vytvorenie objektu

        System.out.println("Zadaj hmotnost telesa v kilogramoch: ");
        double weightKg = mojObjekt.nextDouble();

        System.out.println("Hmotnost telesa v gramoch je: " + prevodMetoda(weightKg));

    }

}
