package laporan_harian;
import java.util.*;

public class day17_java_string_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean palindrome = false;
        StringBuilder sb = new StringBuilder(s);
        String balikan = sb.reverse().toString();
        if (s.equals(balikan)){
            palindrome = true;
        }
        if(palindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

