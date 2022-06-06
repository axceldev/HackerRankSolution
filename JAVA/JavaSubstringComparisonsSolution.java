import java.lang.reflect.Array;
import java.util.Scanner;

public class JavaSubstringComparisonsSolution {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String s = "welcometojava";// scan.next();
        int k = 3; // scan.nextInt();
        // scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] ts = new String[s.length()];
        for (int i = 0; i <= s.length() - k; i++) {
            ts[i] = s.substring(i, i + k);
            System.out.println(ts[i]);
        }
        System.out.println(ts.length);
        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargestPro(String s, int k) {
        String smallest = "";
        String largest = "";
        String ts = new TreeSet<String>();
        for (int i = 0; i <= s.length() - k; i++) {
            ts.add(s.substring(i, i + k));
        }
        smallest = ts.first();
        largest = ts.last();

        return smallest + "\n" + largest;
    }
}