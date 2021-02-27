package no4;

public class UjiBus3 {

    public static void main(String[] abc) {

        Bus3 bus = new Bus3(5);
        bus.getpenumpang(17);
        bus.getpenumpang(24);
        bus.cetakpenumpang();

        // penambahan penumpang
        bus.addpenumpang(2); // menambahkan 2 penumpang
        bus.cetakpenumpang();
        // penambahan penumpang
        bus.addpenumpang(1); // menambahkan 1 penumpang
        bus.cetakpenumpang();
        // penambahan penumpang
        bus.addpenumpang(2); // menambahkan 2 penumpang
        bus.cetakpenumpang();
        // penambahan penumpang
        bus.addpenumpang(2); // menambahkan 2 penumpang
        bus.cetakpenumpang();

    }
}
