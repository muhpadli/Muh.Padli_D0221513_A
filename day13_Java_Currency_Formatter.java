package laporan_harian;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class day13_Java_Currency_Formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat Indi = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat Cina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat France = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = US.format(payment);
        String india = Indi.format(payment);
        String china = Cina.format(payment);
        String france = France.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
