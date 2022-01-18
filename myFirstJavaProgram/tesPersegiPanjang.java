import java.util.*;
public class tesPersegiPanjang {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int inputPanjang, inputLebar;
        System.out.print("Masukkan panjang: ");
        inputPanjang = userInput.nextInt();
        System.out.print("Masukkan lebar: ");
        inputLebar = userInput.nextInt();

        gambar(inputPanjang, inputLebar);
        gabungan(inputPanjang, inputLebar);
//        System.out.println("Luas: " + luas(inputPanjang, inputLebar));
//        System.out.println("Keliling: " + keliling(inputPanjang, inputLebar));
    }
    private static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("+");
            }
            System.out.println("\n");
        }
    }
    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }
    private static int luas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }
    private static void gabungan(int panjang, int lebar){
        System.out.println("Luas: " + luas(panjang, lebar));
        System.out.println("Keliling: " + keliling(panjang, lebar));
    }
}
