import java.util.Scanner;

public class skrivut {
    public static void main(String[] args) {3
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in); //henter metoden scanner fra bibliotek

            System.out.print("Skriv inn et tall: "); //metoden scanner lager et vindu som brukeren kan skrive i,
            // metoden leser inn det brukeren har skrevet inn og metoden oversetter det brukeren skriver inn
            int dag = scanner.nextInt();
        }
    }

}
//dette program tar kun for seg det å åpne dialig vindu hvor brukeren kan skrive noe inn