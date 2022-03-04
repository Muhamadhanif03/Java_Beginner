package Tugas3;     //Muhamad Hanif Muslim XI RPL
import java.util.Scanner;

public class EksekusiBank {
    public static void main(String[] args) {
        int ambil = 0,simpan = 0;
        Scanner pilih = new Scanner(System.in);
        Bank bk = new MethodBank(100000);

        System.out.println("=====BANK JAVA=====");
        System.out.println("-----------------------------");
        for (int i = 1; i >= 1 ; i++) {
            System.out.println("\n");
            System.out.println("Menu ATM");
            System.out.println("1. Cek Saldo\t2. Menabung\t3. Transfer Uang\t4. Menarik Uang\t5. Keluar");
            System.out.print("Pilih Menu ATM : ");
            int menu = pilih.nextInt();
            if (menu == 1) {
                bk.SimpanAwal();
            } else if (menu == 2){
                System.out.print("Masukan jumlah uang yang akan disimpan Rp. ");
                bk.Menabung(simpan);
            } else if (menu == 3){
                System.out.print("Masukan jumlah uang yang akan ditransfer RP. ");
                bk.Transfer(ambil);
            } else if (menu == 4){
                System.out.println("Masukan jumlah uang yang akan ditarik Rp. ");
                bk.Menarik(ambil);
            } else if (menu == 5 ){
                System.out.println("Selamat Tinggal!");
                break;
            } else
                break;
        }
    }
}
