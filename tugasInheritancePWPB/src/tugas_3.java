// TUGAS 3
// SUPERCLASS            MUHAMAD HANIF MUSLIM : XI RPL
class luasLingkaran{
    double r, t;
    double phi;

    // CONSTRUCTOR
    luasLingkaran(double r, double t, double phi){
        this.r = r;
        this.t = t;
        this.phi = phi;
    }

    // METHOD
    void displayFinalTabung(){
        double luasTabung = 2 * (phi * r * r) + (2 * phi * r * t);
        double volumeTabung = (phi * r * r) * t;

        System.out.println("=====MANGHITUNG LUAS DAN VOLUME TABUNG=====");
        System.out.println("Jari jari: " + r);
        System.out.println("Tinggi: " + t);
        System.out.println("PHI: " + phi);
        System.out.println("Luas permukaan tabung adalah: " + luasTabung);
        System.out.println("Volume tabung adalah: " + volumeTabung);
    }
}

// SUBCLASS
class finalTabung extends luasLingkaran{
    finalTabung(double r, double t, final double phi){
        super(r, t, phi);
    }
}

// EKSEKUSI
public class tugas_3 {
    public static void main(String[] args) {
        finalTabung f_tabung = new finalTabung(25, 17.5, 3.14);
        f_tabung.displayFinalTabung();
    }
}
