package Tugas1;     //Muhamad Hanif Muslim XI RPL

public class Kalkulator implements Operasi{
    public void penjumlahan(double num1, double num2){
        double hasil = num1 + num2;
        System.out.println("Hasil dari " + num1 + " + " + num2 + " = " + hasil);
    }
    public void pengurangan(double num1, double num2){
        double hasil = num1 - num2;
        System.out.println("Hasil dari " + num1 + " - " + num2 + " = " + hasil);
    }
}
