class transport1{
    String nama;
    int roda, stir, rem, jok;

    void display(){
        System.out.println(nama + " memiliki " + roda + " roda");
        System.out.println(nama + " memiliki " + stir + " stir" );
        System.out.println(nama + " memiliki " + rem + " rem" );
        System.out.println(nama + " memiliki " + jok + " jok" );
    }
}

class mercedes extends transport1{

}

public class test {
    public static void main(String[] args) {
        mercedes ferrari = new mercedes();
        ferrari.nama = "Bajaj";
        ferrari.roda = 4;
        ferrari.stir = 1;
        ferrari.jok = 4;
        ferrari.rem = 4;
        ferrari.display();
    }
}
