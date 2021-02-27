package Praktikum1;

public class UjiBus4 {

    public static void main(String[] args) {

        Bus4 bus = new Bus4(5);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.getAverage();
        bus.cetakpenumpang();

        // penambahan penumpang
        bus.addpenumpang(2); // menambahkan 2 penumpang
        bus.getAverage();
        bus.cetakpenumpang();
        // penambahan penumpang
        bus.addpenumpang(1); // menambahkan 1 penumpang
        bus.getAverage();
        bus.cetakpenumpang();
        // penambahan penumpang
        bus.addpenumpang(2); // menambahkan 2 penumpang
        bus.getAverage();
        bus.cetakpenumpang();
        // penambahan penumpang
        bus.addpenumpang(2); // menambahkan 2 penumpang
        bus.getAverage();
        bus.cetakpenumpang();
    }
}
