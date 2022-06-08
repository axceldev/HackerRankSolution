
public class JavaSubstringComparisonsSolution {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String s = "welcometojava";// scan.next();
        int k = 3; // scan.nextInt();
        // scan.close();
        //compareTo();
       System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        for(int i = 0; i <= s.length() - k; i++){
            String sTemp = s.substring(i, i + k);
            System.out.println(sTemp.compareTo(smallest));
            if(sTemp.compareTo(smallest) < 0) {
                smallest = sTemp;
            }
            System.out.println(sTemp.compareTo(largest));
            if(sTemp.compareTo(largest) > 0) {
                largest = sTemp;
            } 
        }
        
        return smallest + "\n" + largest;
    }

    public static void compareTo(){
        /*
         * va retornar < 0 si la cadena es lexicográficamente menor que la otra cadena
         */
        String str_Sample = "a";
        System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("b"));
        /*
         * va retornar > 0 si la cadena es lexicográficamente mayor que la otra cadena 
         */
        str_Sample = "b";
        System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));
        /*
         * va retornar 0 si la cadena es igual a la otra cadena.
         */
        str_Sample = "b";
        System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
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