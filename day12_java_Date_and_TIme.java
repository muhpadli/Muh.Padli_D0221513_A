package laporan_harian;

import java.text.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static String findDay(int month, int day, int year) {
        SimpleDateFormat fw = new SimpleDateFormat("EEEE");
        Calendar kalender = new GregorianCalendar(year, month - 1, day);
        String hari = fw.format(kalender.getTime());
        hari = hari.toUpperCase();
        return hari;
    }

}

public class day12_java_Date_and_TIme {
}
