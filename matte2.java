import java.lang.Math; //bruker skriver inn 2 tall, programmet bruker funksjonen Math.pow(x,n) til -
import java.util.Scanner; // å regne ut produktet av disse to tallene hvor n er potensen til x
// oppgave 4B fra uke 36
public class matte2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn et tall: ");
        // lager et skrivefelt som brukeren kan skrive i
        int n = scanner.nextInt();

        System.out.print("Skriv inn et tall: ");
        // lager et skrivefelt som brukeren kan skrive i
        int x = scanner.nextInt();

        System.out.println(Math.pow(x,n));
    }
}