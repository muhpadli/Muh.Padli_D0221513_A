package laporan_harian;
import java.util.*;
public class day31_Java_ArrayList {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int d = scan.nextInt();
            ArrayList<Integer> baris = new ArrayList<>();
            
            if(d>0) {
                for(int j=0; j<d; j++) {
                    int element = scan.nextInt();
                    baris.add(element);
                }
            } 
            data.add(baris);
        } // end of input element
        
        int q = scan.nextInt();
        for(int i=0; i<q;i++) {
            int x = scan.nextInt()-1;
            int y = scan.nextInt()-1;
            if(x<n && data.get(x) !=null && y<data.get(x).size()) {
                int element = data.get(x).get(y);
                System.out.println(element);
            } else {
                System.out.println("ERROR!");
            }
            
        }
    }
}
