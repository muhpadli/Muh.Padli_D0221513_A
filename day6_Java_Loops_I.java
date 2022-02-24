package laporan_harian;
import java.io.*;


public class day6_Java_Loops_I {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int j=1; j<=10; j++ ){
            System.out.println(N+ " x " +j+ " = "+(N*j));
        }
    }
}
