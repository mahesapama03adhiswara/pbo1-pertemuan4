package tugas1;

public class do_while {
    public static void main(String[] args) {
        int buahApel = 0;
        int keranjang1 = 10;
        int keranjang2 = 20;
        int keranjang3 = 30;

        System.out.println("masukkan buah apel :"+buahApel+"kg buah apel");
        System.out.println("isi keranjang 1 :"+keranjang1+"kg buah apel");
        System.out.println("hasil dalam 2 lusin :"+keranjang2+"kg buah apel");

        do {
            buahApel++;
            System.out.println("memasukkan buah apel ...");
            System.out.println("isi buah di keranjang: " + buahApel + "kg buah apel");

        }while (buahApel != keranjang1);
        System.out.println("Akhir Isi baramng:"+ buahApel+ "kg buah apel");



    }
}
