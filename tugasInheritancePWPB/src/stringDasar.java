import java.util.Arrays;
import java.lang.String;

public class stringDasar {
    public static void main(String[] args) {
        // MEMBUAT STRING
        String kataStr = "Muhamad Hanif Muslim";
        char[] kataChar = {'H', 'a', 'n', 'i', 'f'};

        // MENAMPILKAN STRING
        System.out.println("Kata String: " + kataStr);
        System.out.println("Kata Char: " + Arrays.toString(kataChar));

        // MENAMPILKAN STRING LEBIH SPESIFIK
        System.out.println("\n===Mengambil sebuah char didalam String===");
        System.out.println(kataStr.charAt(0));

        // MENGEDIT STRING
        System.out.println("\n===MENGEDIT STRING SECARA TIDAK LANGSUNG===");
        System.out.println(kataStr.substring(0, 7));
    }
}
