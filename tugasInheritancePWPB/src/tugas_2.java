// TUGAS 2
// SUPER CLASS HEWAN            MUHAMAD HANIF MUSLIM : XI RPL
class Hewan{
    String nama;
    String makanan;

    // CONSTRUCTOR
    Hewan(String nama, String makanan){
        this.nama = nama;
        this.makanan = makanan;
    }

    // METHOD
    void display(){
        System.out.println("=====HERBIVORA=====");
        System.out.println(this.nama + " memakan " + this.makanan);
    }
}

// SUB CLASS HERBIVORA
class Herbivora extends Hewan{
    Herbivora(String nama, String makanan){
        super(nama, makanan);     //MEMANGGIL CONSTRUCTOR YG ADA DI SUPERCLASS.
    }
}

// EKSEKUSI
public class tugas_2 {
    public static void main(String[] args) {
        Herbivora hewan1 = new Herbivora("Kura-kura", "sayuran dan buah-buahan");
        hewan1.display();
    }
}
