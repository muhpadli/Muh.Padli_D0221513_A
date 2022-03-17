package laporan_harian;

import java.util.*;
import java.math.*;

public class day27_Java_BigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger C = A.add(B);
        BigInteger D = A.multiply(B);
        System.out.println(C);
        System.out.println(D);
    }
}
