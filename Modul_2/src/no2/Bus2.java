package no2;

public class Bus2 {

    private int maxPenumpang;
    private int penumpang;

    // konstruktor kelas bus
    public Bus2(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    // method mutator untuk menambahkan penumpang

    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if ( temp >= maxPenumpang){
            System.out.println("Penumpang melebihi quota ");
        }
        else
            this.penumpang = temp;
    }

    public void cetak(){
        System.out.println("Penumpang bus sekarang adalah : " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah : " + maxPenumpang + "\n");
    }
}
