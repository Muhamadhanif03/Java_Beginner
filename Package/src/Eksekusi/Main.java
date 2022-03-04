package Eksekusi;

import Sekolah.siswa;

public class Main {
    public static void main(String[] args) {
        siswa siswa1 = new siswa("Mamat");
        siswa siswa2 = new siswa("Asep");
        siswa siswa3 = new siswa("Ujang");

        siswa1.display();
        siswa2.display();
        siswa3.display();
    }
}
