package Tugas1;     //Muhamad Hanif Muslim XI RPL
import java.util.Scanner;

public class UjiKalkulator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("=====KALKULATOR SEDERHANA=====");
        System.out.println("-----------------------------");
        System.out.print("Masukkan angka pertama: ");
        double num1 = userInput.nextInt();

        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.print("Masukkan nomor operator: ");
        int operator = userInput.nextInt();

        System.out.print("Masukkan angka kedua: ");
        double num2 = userInput.nextInt();

        switch(operator){
            case 1: Operasi tambah = new Kalkulator();
            tambah.penjumlahan(num1, num2);
            break;
            case 2: Operasi kurang = new Kalkulator();
            kurang.pengurangan(num1, num2);
        }
    }
}
