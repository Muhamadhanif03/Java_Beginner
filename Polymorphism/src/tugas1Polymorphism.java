class kendaraan{
    String namaBahanBakar;

    kendaraan (String namaBahanBakar){
        this.namaBahanBakar = namaBahanBakar;
    }
    void bbm(){
        System.out.println("Kendaraan menggunakan bahan bakar " + namaBahanBakar);
    }
}

class mobil extends kendaraan{
    mobil(String namaBahanBakar){
        super(namaBahanBakar);
    }
    void bbm(){
        System.out.println("Mobil menggunakan bahan bakar " + namaBahanBakar);
    }
}

class keretaApi extends kendaraan{
    keretaApi(String namaBahanBakar){
        super(namaBahanBakar);
    }
    void bbm(){
        System.out.println("Kereta Api menggunakan bahan bakar " + namaBahanBakar);
    }
}

class pesawat extends kendaraan{
    pesawat(String namaBahanBakar){
        super(namaBahanBakar);
    }
    void bbm(){
        System.out.println("Pesawat menggunakan bahan bakar " + namaBahanBakar);
    }
}

public class tugas1Polymorphism {
    public static void main(String[] args) {
        kendaraan myTransport = new kendaraan("BBM");
        myTransport.bbm();

        mobil myCar = new mobil("Solar");
        myCar.bbm();

        keretaApi myTrain = new keretaApi("Batu bara");
        myTrain.bbm();

        pesawat myPlane = new pesawat("Avtur");
        myPlane.bbm();
    }
}
