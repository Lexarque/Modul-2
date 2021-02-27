package no3;

public class TestSiswa {

    public static void main(String[] args) {

        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");

        System.out.println("Siswa : " + siswa.getName() + "\nAbsen : " + siswa.getAbsen() +
                "\nAddress : " + siswa.getAddress());
    }
}
