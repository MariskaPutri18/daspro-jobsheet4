import java.util.Scanner;

public class HargaBayar18 {
     public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int harga, jumlah, jmlHalBuku;
    String merkBuku;
    double total, bayar, jmlDis, dis;

    System.out.println("Masukkan harga barang yang dibeli");
    harga=input.nextInt();
    System.out.println("Masukkan Jumlah jumlah barang yang dibeli");
    jumlah=input.nextInt();
     System.out.println("Masukkan besar diskon");
    dis=input.nextDouble();
     System.out.println("Masukkan nama merek buku");
    merkBuku=input.next();
     System.out.println("Masukkan jumlah halaman buku");
    jmlHalBuku=input.nextInt();

    total=harga*jumlah;
    jmlDis=(total*( dis / 100));
    bayar=total-jmlDis;

    System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
    System.out.println("Jumlah yang harus dibayar adalah" + bayar);
    input.close();
    }
}