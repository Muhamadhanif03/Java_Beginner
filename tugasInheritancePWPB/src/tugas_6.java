// TUGAS 6
// SUPERCLASS            MUHAMAD HANIF MUSLIM : XI RPL
class bangun_datar{
    double alas;
}

// SUBCLASS
class segitiga extends bangun_datar{
    double tinggi;

    // METHOD
    void display(){
        double rumus = 0.5 * alas * tinggi;

        System.out.println("=====MENGHITUNG LUAS=====");
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Luas: " + rumus);
    }
}

// EKSEKUSI
public class tugas_6 {
    public static void main(String[] args) {
        segitiga objek1 = new segitiga();
        objek1.alas = 15;
        objek1.tinggi = 23;
        objek1.display();
    }
}