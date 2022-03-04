// TUGAS 5
// SUPERCLASS            MUHAMAD HANIF MUSLIM : XI RPL
class persegi{
    double sisi;

    // CONSTRUCTOR
    persegi(double sisi){
        this.sisi = sisi;
    }

    // METHOD
    void display(){
        double volumeKubus = sisi * sisi * sisi;
        System.out.println("=====MENGHITUNG VOLUME KUBUS=====");
        System.out.println("Sisi: " + sisi);
        System.out.println("Volume kubus adalah " + volumeKubus);
    }
}

// SUBCLASS
class finalPersegi extends persegi{
    finalPersegi(double sisi){
        super(sisi);
    }
}

// EKSEKUSI
public class tugas_5 {
    public static void main(String[] args) {
        finalPersegi f_persegi = new finalPersegi(5);
        f_persegi.display();
    }
}
