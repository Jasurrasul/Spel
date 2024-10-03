package Växter;
import java.util.Scanner;

public class Huvudprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange växtens namn (Kaktusen Igge, Palmen Laura, Köttätande Meatlof eller Palmen Olof)\n: ");
        String växtNamn = scanner.nextLine().trim();

        Växt växt = null;

        // Skapa rätt växt baserat på användarens input
        switch (växtNamn) {
            case "Kaktusen Igge":
                växt = new KaktusenIgge();
                break;
            case "Palmen Laura":
                växt = new PalmenLaura();
                break;
            case "Köttätande Meatlof":
                växt = new KöttätandeMeatlof();
                break;
            case "Palmen Olof":
                växt = new PalmenOlof();
                break;
            default:
                System.out.println("Ogiltigt namn. Vänligen ange Kaktusen Igge, Palmen Laura, Köttätande Meatlof eller Palmen Olof.");
                return;
        }

        // Anropa metoden för att skriva ut vattenbehovet
        växt.skrivUtVattenbehov();
    }
}