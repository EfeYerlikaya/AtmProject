package AtmProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quiz notunu giriniz :");
        int quiz  = sc.nextInt();
        System.out.println("Vize notunu giriniz:");
        int vize = sc.nextInt() ;
        System.out.println("Final notunu giriniz:");
        int sonsinav = sc.nextInt();


         double ortalama = (quiz * 0.2) + (vize * 0.35) + (sonsinav * 0.45);
        System.out.println(" Ortalamamnız :" + ortalama);
        String sonuc = (ortalama >= 50 ) ? "Geçtiniz " : " Kaldınız";
        System.out.println(sonuc);

    }
}