import java.util.Scanner;

/*
    #Java ile Fizik, Matematik, Türkçe, Kimya, Müzik, Tarih derslerinin sınav puanlarını kullanıcıdan alan ve bu
     derslerin ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 */

public class notOrtalamaHesaplama {
    public static void main (String[] args) {

        int turk, mat, bio, kim, muz, tar, edb ;


        Scanner not = new Scanner(System.in);
        System.out.print("Türkçe notunuz =");
        turk = not.nextInt();

        System.out.print("Matematik notunuz =");
        mat = not.nextInt();

        System.out.print("Biyoloji notunuz =");
        bio = not.nextInt();

        System.out.print("Kimya notunuz =");
        kim = not.nextInt();

        System.out.print("Müzik notunuz =");
        muz = not.nextInt();

        System.out.print("Tarih notunuz =");
        tar = not.nextInt();

        System.out.print("Edebiyat notunuz =");
        edb = not.nextInt();

        int toplam = (turk+ mat+ bio+ kim+ muz+ tar+ edb);
        double notort = toplam / 7 ;

        System.out.println("Not Ortalamanız : " + notort);

        String sonuc = (notort >= 55) ? "Geçtiniz" : "Kaldınız" ;

        System.out.print(sonuc);



    }
}
