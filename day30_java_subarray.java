
package laporan_harian;
import java.util.*;
public class day30_java_subarray {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); int[] A = new int[n]; 
        for(int i =0; i<n; i++) { 
            A[i]=sc.nextInt(); 
        } 
        int nNegativeSum = 0; 
        for(int i=0;i<A.length;i++) { 
            for(int j=i; j<A.length;j++) { 
                int sum = 0; 
                for(int k=i; k<=j;k++) { 
                    sum += A[k]; 
                } 
                if(sum<0) { 
                    nNegativeSum++; 
                }
            } 
        } 
        System.out.println(nNegativeSum);
    }
}
