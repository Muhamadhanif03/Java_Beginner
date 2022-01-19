import java.util.*;
public class tesRekursif {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = userInput.nextInt();
        System.out.print("Nilai yang anda masukkan adalah: " + nilai);

        System.out.println("\n");

        System.out.println("===MENAMPILKAN NILAI===");
        showNilai(nilai);

        System.out.println("\n");

        System.out.println("===MENAMPILKAN PENJUMLAHAN DARI PARAMETER");
        int jumlah_1 = tambahNilai(nilai);
        System.out.println("Hasilnya adalah: " + jumlah_1);

        System.out.println("\n");

        System.out.println("===MENAMPILKAN PERKALIAN DARI PARAMETER");
        int jumlah_2 = kaliNilai(nilai);
        System.out.println("Hasilnya adaah: " + jumlah_2);
    }
    private static void showNilai(int parameter){
        System.out.println("Nilai: " + parameter);

        if (parameter == 0){
            return;
        }
        parameter--;
    }
    private static int tambahNilai(int parameter){
        System.out.println("Parameter " + parameter);

        if (parameter == 0){
            return parameter;
        }
        return parameter + tambahNilai(parameter - 1);
    }
    private static int kaliNilai(int parameter){
        System.out.println("Parameter " + parameter);

        if (parameter == 1){
            return parameter;
        }
        return parameter * kaliNilai(parameter - 1);
    }
}
