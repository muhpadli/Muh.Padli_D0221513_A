package laporan_harian;

import java.util.*;

public class day14_Java_Strings_Introduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String AUpper = A.substring(0, 1);
        String BUpper = B.substring(0, 1);
        System.out.println(AUpper.toUpperCase() + A.substring(1, A.length()) + " " + BUpper.toUpperCase() + B.substring(1, B.length()));
    }
}
