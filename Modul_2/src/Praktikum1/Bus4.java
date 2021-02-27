package Praktikum1;

import java.util.Scanner;

public class Bus4 {

    public double penumpang;
    public double maxPenumpang;
    private double penumpangBaru;
    private double counter;
    private double weight;
    Scanner S = new Scanner(System.in);

    public Bus4(double maxPenumpang){
        this.maxPenumpang = (int)maxPenumpang;
        penumpang = 0;
    }

    // method mutator
    public void addpenumpang(double penumpang){
        int temp;
        temp = (int)this.penumpang + (int)penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi quota");
        }else{
            this.penumpang = temp;
        }
    }
    // method untuk mengecek apakah password benar atau salah
    public void getpenumpang(int password){
        if (password == 24){
            System.out.println("Password benar");
        }else{
            System.out.println("Password salah");
        }
    }

    // Untuk menampilkan data - data yang tersedia / sudah dimasukkan
    public void cetakpenumpang(){
        System.out.println("---------------------------------------------------");
        System.out.println("penumpang bus sekarang : " + penumpang);
        System.out.println("Maximum penumpang yang seharusnya adalah : " + maxPenumpang);
        if(penumpang == 0){
            System.out.println("Penumpang masih kosong");
        }else{
            System.out.println("Rata - rata berat penumpang sekarang adalah : " + counter);
        }
        System.out.println("---------------------------------------------------");
    }

    // method untuk menghitung rata - rata dari penumpang saat ditambahkan
    public double getAverage(){
        boolean c = true;
        if(this.penumpang == 0){
            System.out.println("Masih belum ada penumpang");
        }else if(this.penumpangBaru == maxPenumpang){
            System.out.println("Sudah tidak bisa menambahkan berat badan");
        } else{
            while(c){
                penumpangBaru++;
                System.out.print("Masukkan berat penumpang ke " + penumpangBaru + " adalah : ");
                weight = weight + S.nextDouble();
                if(penumpangBaru == this.penumpang){
                    c = false;
                }
            }
        }
        return counter = weight / penumpang;
    }
}
