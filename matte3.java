import java.lang.Math; //bruker skriver inn 2 tall, programmet bruker for løkke til å regne -
import java.util.Scanner; //  ut produktet av disse to tallene hvor n er potensen til x
// oppgave 4B fra uke 36
public class matte3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // henter ut metoden scanner fra bibliotek

        System.out.print("Skriv inn et tall: ");
        // lager et skrivefelt som brukeren kan skrive i, scanner både leser og oversetter det bruker skriver
        int x = scanner.nextInt(); // overfører verdi til variabel x

        System.out.print("Skriv inn et tall: ");
        // lager et skrivefelt som brukeren kan skrive i slik som ovenfor, bare at verdi til overført til n
        int n = scanner.nextInt();

        int sum = 1; // kaller variabelen som begynner som 1 for sum
        for (int i = 0; i < n; i++){ // vi lar n være antall runder løkken kjører
            sum = sum * x; // vi ganger x med sum n ganger,altså sum gange x,løkken kjører på nytt og sum-
            // oppdaters til det forrige produktet av sum og x, løkken fortsetter så neste runde så lenge
            // n tillater det


        }
        System.out.println(sum); // tar outprint ut av løkken for å slippe å få printet ut alle resulatene
        // til alle rundene løkken kjører

    }
}