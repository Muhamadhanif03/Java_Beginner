// TUGAS 1
// SUPER CLASS TRANSPORT            MUHAMAD HANIF MUSLIM : XI RPL
class transport{
    String nama;
    int roda, stang, rem, jok;

    // CONSTRUCTOR
    transport(String nama, int roda, int stang, int rem, int jok){
        this.nama = nama;
        this.roda = roda;
        this.stang = stang;
        this.rem = rem;
        this.jok = jok;
    }

    // METHOD
    void Kendaraan(){
        System.out.println("=====Spesifikasi Mobil=====");
        System.out.println(this.nama + " memiliki " + this.roda + " roda");
        System.out.println(this.nama + " memiliki " + this.stang + " stang");
        System.out.println(this.nama + " memiliki " + this.rem + " rem");
        System.out.println(this.nama + " memiliki " + this.jok + " jok");
    }
}

// SUB CLASS MOBIL
class mobil extends transport{
    mobil(String nama, int roda, int stang, int rem, int jok){
        super(nama, roda, stang, rem, jok);     //MEMANGGIL CONSTRUCTOR YG ADA DI SUPERCLASS.
    }
}

// EKSEKUSI
public class tugas1 {
    public static void main(String[] args) {
        // MOBIL
        mobil object1 = new mobil("Ferrari", 4, 1, 2, 2);
        object1.Kendaraan();
    }
}