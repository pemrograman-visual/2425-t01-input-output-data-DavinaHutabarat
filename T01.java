// 12S24047 - Davina Olivia Yosefanny Hutabarat
// 12S24050 - Ester Hasianna Nainggolan

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis;
        int tahunterbit;
        String penerbit;
        String formatbukuelektronik;
        double hargapembelian, minimummargin;
        int stok;
        double rating;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextInt();
        penerbit = input.nextLine();
        formatbukuelektronik = input.nextLine();
        hargapembelian = input.nextDouble();
        minimummargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektronik + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating);
    }
}
