import java.util.Scanner;

public class Tugas1Biskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int harga = 50000;
        int totalTiket = 0;
        int totalPenjualan = 0;
        int jumlah;
 
        System.out.println("Harga tiket Rp 50000. Masukkan 0 untuk selesai.");
 
        System.out.print("Jumlah tiket: ");
        jumlah = sc.nextInt();
 
        while (jumlah != 0) {
            if (jumlah < 0) {
                System.out.println("Input tidak valid, silakan input ulang");
            } else {
                int total = jumlah * harga;
                int diskon = 0;
 
                if (jumlah > 10) {
                    diskon = 15;
                } else if (jumlah > 4) {
                    diskon = 10;
                }
 
                total = total - (total * diskon / 100);
 
                System.out.println("Diskon: " + diskon + "%");
                System.out.println("Total bayar: Rp " + total);
 
                totalTiket = totalTiket + jumlah;
                totalPenjualan = totalPenjualan + total;
            }
 
            System.out.print("Jumlah tiket: ");
            jumlah = sc.nextInt();
        }
 
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);


    }
    
}
