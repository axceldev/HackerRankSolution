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
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        for(int i = 0; i <= s.length() - k; i++){
            String sTemp = s.substring(i, i + k);
            System.out.println(sTemp + "?" + smallest);
            if(sTemp.compareTo(smallest) < 0) {
                smallest = sTemp;
            }
            System.out.println(sTemp + "?" + largest);
            if(sTemp.compareTo(largest) > 0) {
                largest = sTemp;
            } 
        }
        
        return smallest + "\n" + largest;
    }


    /*public static String getSmallestAndLargestPro(String s, int k) {
        String smallest = "";
        String largest = "";
        String ts = new TreeSet<String>();
        for (int i = 0; i <= s.length() - k; i++) {
            ts.add(s.substring(i, i + k));
        }
        smallest = ts.first();
        largest = ts.last();

        return smallest + "\n" + largest;
    }*/
}