package tugas1;

public class while_ {
    public static void main(String[] args) {
        int buahApel = 0;
        int keranjang1 = 10;
        int keranjang2 = 20;
        int keranjang3 = 30;

        System.out.println("masukkan buah apel :"+buahApel+"kg buah apel");
        System.out.println("isi keranjang 1 :"+keranjang1+"kg buah apel");
        System.out.println("isi keranjang 2 :"+keranjang2+"kg buah apel");
        System.out.println("isi keranjang 3 :"+keranjang3+"kg buah apel");
        while (buahApel != keranjang1){
            buahApel++;
            System.out.println("memasukkan buah apel ...");
            System.out.println("isi buah di keranjang: " + buahApel + "kg buah apel");

        }
        System.out.println("Akhir Isi di keranjang:"+ buahApel+ "kg buah apel");



    }
}
