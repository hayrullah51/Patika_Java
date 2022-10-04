import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {


        int matematik, fizik, kimya, felsefe, tarih, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        matematik = inp.nextInt();

        System.out.println("Fizik Notunuzu Giriniz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz : ");
        felsefe = inp.nextInt();

        System.out.println("Tarih Notunuzu Giriniz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuzu Giriniz : ");
        muzik = inp.nextInt();

        int toplam = (matematik + fizik + kimya + tarih + muzik + felsefe);

        double ortalama = toplam / 6;

        System.out.println("Not ortalamanız: " + ortalama);

        String sonuc = (ortalama >= 60) ? "Sinifinizi gecmeye hak kazandiniz..." : "Malesef kaldiniz!!!";

        System.out.println(sonuc);

    }
}