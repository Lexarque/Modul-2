package Praktikum2;

public class TestBola {

    public static void main(String[] args) {

        // Membuat objek dari class Bola
        Bola bo = new Bola();

        // Memanggil method sebelum memasukkan nilai jari - jari
        bo.ShowDiameter();
        bo.showLuasPermukaan();
        bo.showVolume();

        // Memanggil method setelah memasukkan nilai pada jari jari
        bo.SetJariJari();
        bo.ShowDiameter();
        bo.showLuasPermukaan();
        bo.showVolume();
    }
}
