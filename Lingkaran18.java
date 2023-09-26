import java.util.Scanner;

public class Lingkaran18 {
     public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int r;
    double phi = 3.14;
    double keliling, luas;

    System.out.print("Masukkan jari-jari: ");
    r = input.nextInt();

    keliling = 2* phi*r;
    luas = phi * r * r;

    System.out.println("keliling lingkaran = " + keliling + "cm");
    System.out.println("luas lingkaran = " + keliling);
    input.close();
    }
}