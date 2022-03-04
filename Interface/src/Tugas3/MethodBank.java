package Tugas3;     //Muhamad Hanif Muslim XI RPL
import java.util.Scanner;

public class MethodBank implements Bank{
    int saldo;
    Scanner masukan = new Scanner(System.in);

    MethodBank(int saldo){
        this.saldo = saldo;
    }
    public void SimpanAwal(){
        System.out.println("Saldo awal adalah : Rp. " + saldo);
    }

    public void Menabung(int simpan){
        simpan = masukan.nextInt();
        saldo = simpan+saldo;
        System.out.println("Saldo Saat ini adalah Rp. " + saldo);
    }

    public void Transfer(int ambil){
        ambil = masukan.nextInt();
        if (saldo < ambil) {
            System.out.println("Maaf Saldo anda kurang !");
        } else saldo = saldo - ambil;
        System.out.println("Saldo Saat ini adalah Rp. " + saldo);
    }
    public void Menarik(int ambil){
        ambil = masukan.nextInt();
        if (saldo < ambil) {
            System.out.println("Maaf Saldo anda kurang !");
        } else saldo = saldo - ambil;
        System.out.println("Saldo Saat ini adalah Rp. " + saldo);
    }
}
