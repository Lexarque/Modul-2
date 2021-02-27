package Praktikum2;

import java.util.Scanner;

public class Bola {

    private double jarijari;
    Scanner S = new Scanner(System.in);

    // Method mutator
    public void SetJariJari(){
        System.out.println("Masukkan nilai jari - jari : ");
        this.jarijari = S.nextDouble();
    }
    public void ShowDiameter(){
        System.out.println("Diameter lingkaran tersebut adalah : " + (jarijari * 2));
    }
    public void showLuasPermukaan(){
        double lp = 4 * Math.PI * Math.pow(jarijari, 2);
        System.out.println("Luas permukaan Bola tersebut adalah : " + lp);
    }
    public void showVolume(){
        double V = (4 * Math.PI * Math.pow(jarijari, 3)) / 3;
        System.out.println("Volume Bola tersebut adalah : " + V);
    }
}
