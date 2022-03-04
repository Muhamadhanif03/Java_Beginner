class data{
    int i;
    int [] nilai = {60, 55, 78, 90, 95};
    float total;
    float rataRata;
}

class tampilData extends data{
    void viewData(){
        for(i=0; i< nilai.length; i++){
            System.out.println("Nilai ke-" + (i+1) + " adalah " + nilai[i]);
        }
        int maksimum = nilai[0];

        for(i = 0; i < nilai.length; i++) {
            if (nilai[i] > maksimum){
                maksimum = nilai[i];
            }
        }
        System.out.println("\nNilai terbesar adalah: " + maksimum);
        int minimum = nilai[0];

        for(i = 0; i < nilai.length; i++) {
            if (nilai[i] < minimum){
                minimum = nilai[i];
            }
        }
        System.out.println("\nNilai terkecil adalah: " + minimum);
    }
}

class nilaiDanRata extends data{
    void totalNilai(){
        for (i=0; i<nilai.length; i++){
            total = total + nilai[i];
        }
        rataRata = total / nilai.length;

        System.out.println("\nTotal nilai adalah: " + total);
        System.out.println("\nRata-rata: " + rataRata);
    }
}

public class tesPoly2 {
    public static void main(String[] args) {
        tampilData myData = new tampilData();
        myData.viewData();

        nilaiDanRata myNilai = new nilaiDanRata();
        myNilai.totalNilai();
    }
}
