package laporan_harian;

import java.util.Scanner;

public class day21_Java_Regex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
//Write your code here

class MyRegex {

    public String pattern = "((([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])"
            + "\\.){3}([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\b)";
}
