// Nama = Muhamad Hanif Musilm
// Kelas = XI RPL
class kendaraan{        //Super Class
    String nama;

    kendaraan(String nama){
        this.nama = nama;
    }
    void bbm(){     //Method
        System.out.println(this.nama + " menggunakan solar");
    }
}

class car extends kendaraan{      //Sub Class
    car (String nama){   //Constructor
        super(nama);
    }
    void bbm(){     //Method
        System.out.println(this.nama + " menggunakan listrik");
    }
}

class keretaApi extends kendaraan{      //Sub Class
    keretaApi (String nama){   //Constructor
        super(nama);
    }
    void bbm(){     //Method
        System.out.println(this.nama + " menggunakan batu bara");
    }
}

class pesawat extends kendaraan{      //Sub Class
    pesawat(String nama){   //Constructor
        super(nama);
    }
    void bbm(){     //Method
        System.out.println(this.nama + " menggunakan avtur");
    }
}

public class tesPoly {      //Eksekusi
    public static void main(String[] args) {
        car myCar = new car("Tesla Model X");
        myCar.bbm();

        keretaApi myTrain = new keretaApi("KA_Padalarang-Bandung");
        myTrain.bbm();

        pesawat myPlain = new pesawat("Garuda Indonesia");
        myPlain.bbm();
    }
}
