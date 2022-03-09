package laporan_harian;

import java.util.*;

public class day19_java_string_tokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // Write your code here.
        str = str.replaceAll("[!,?._'@\\s]+", " ");
        StringTokenizer st = new StringTokenizer(str);
        int n = st.countTokens();
        System.out.println(n);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        scan.close();
    }
}
