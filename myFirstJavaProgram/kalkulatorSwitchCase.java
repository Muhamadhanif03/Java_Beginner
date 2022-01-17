import java.util.*;
public class kalkulatorSwitchCase {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int bilangan1, bilangan2;
        String operasi;

        System.out.print("Masukkan bilangan pertama: ");
        bilangan1 = userInput.nextInt();

        System.out.println("Silahkan pilih operasi yang anda inginkan:\n+\n-\n/\nx");
        System.out.print("Masukkan pilihan anda: ");
        operasi = userInput.next();

        System.out.print("Masukkan bilangan kedua: ");
        bilangan2 = userInput.nextInt();

        System.out.println("Hasil dari " + bilangan1 + operasi + bilangan2);

        switch (operasi){
            case "/":
                System.out.println(bilangan2 / bilangan2);
                break;
            case "x":
                System.out.println(bilangan1 * bilangan2);
                break;
            case "-":
                System.out.println(bilangan1 - bilangan2);
                break;
            case "+":
                System.out.println(bilangan1 + bilangan2);
                break;
            default:
                System.out.println("Anda memasukkan operasi yang salah");
        }
    }
}
