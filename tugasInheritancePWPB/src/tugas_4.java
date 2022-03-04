// TUGAS 4
// SUPERCLASS            MUHAMAD HANIF MUSLIM : XI RPL
class burung{
    String bentukParuh;
    String makanan;
    String warnaBulu;
    String bentukTungkai;

    // CONSTRUCTOR
    burung(String bentukParuh, String makanan, String warnaBulu, String bentukTungkai){
        this.bentukParuh = bentukParuh;
        this.makanan = makanan;
        this.warnaBulu = warnaBulu;
        this.bentukTungkai = bentukTungkai;
    }
}

// SUBCLASS
class finalElang extends burung{
    finalElang(String bentukParuh, String makanan, String warnaBulu, String bentukTungkai){
        super(bentukParuh, makanan, warnaBulu, bentukTungkai);
    }

    // METHOD
    void display(){
        System.out.println("===KARAKTERISTIK ELANG===");
        System.out.println("Elang memiliki bentuk paruh yang " + bentukParuh);
        System.out.println("Elang memakan " + makanan);
        System.out.println("Elang bulunya berwarna " + warnaBulu);
        System.out.println("Elang bentuk tungkainya " + bentukTungkai);
    }
}

// EKSEKUSI
public class tugas_4 {
    public static void main(String[] args) {
        finalElang elang = new finalElang("tajam dan bengkok", "daging",
                "hitam dan putih", "ke belakang");
        elang.display();
    }
}
