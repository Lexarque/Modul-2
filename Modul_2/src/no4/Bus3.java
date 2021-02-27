package no4;

public class Bus3 {

    public int penumpang;
    public int maxPenumpang;

    public Bus3(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    // method mutator
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi quota");
        }else{
            this.penumpang = temp;
        }
    }

    public void getpenumpang(int password){
        if (password == 24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
    }
    public void cetakpenumpang(){
        System.out.println("penumpang bus sekarang : " + penumpang);
        System.out.println("Maximum penumpang yang seharusnya adalah : " + maxPenumpang);
    }
}
