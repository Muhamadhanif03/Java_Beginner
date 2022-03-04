class transportasi{
    void bbm(){
        System.out.println("Transportasi mengggunakan BBM");
    }
}
class car extends transportasi{
    void bbm(){
        System.out.println("Mobil menggunakan pertalite");
    }
}
class train extends transportasi{
    void bbm(){
        System.out.println("Kereta Api menggunakan Batu bara");
    }
}
class plane extends transportasi{
    void bbm(){
        System.out.println("Pesawat menggunakan avtur");
    }
}

public class tes {
    public static void main(String[] args) {
        transportasi myTr = new transportasi();
        myTr.bbm();

        transportasi myCr = new car();
        myCr.bbm();

        transportasi myIn = new train();
        myIn.bbm();

        transportasi myPl = new plane();
        myPl.bbm();

    }
}
