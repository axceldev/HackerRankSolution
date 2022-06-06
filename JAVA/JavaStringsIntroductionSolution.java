public class JavaStringsIntroductionSolution {
    public static void main(String[] args) {
        
        //Scanner sc=new Scanner(System.in);
        String A="hello";
        String B="java";
        System.out.println(A.length()+B.length());
        char firstLtr = A.charAt(0);
        char firstLtr2 = B.charAt(0);
        if (Character.compare(firstLtr, firstLtr2) > 0) {
            System.out.println("Yes");
        } else if (Character.compare(firstLtr, firstLtr2) < 0) {
            System.out.println("No");
        } else if (Character.compare(firstLtr, firstLtr2) == 0) {
            System.out.println("No");
        } else {
            System.out.println(firstLtr + " and " + firstLtr2 + " are invalid characters");
        }
        System.out.println(convertirMayus(A)+" "+convertirMayus(B));
        //sc.close();
        /* 
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length())); */
    }
    
    static String convertirMayus(String text){
        String firstLtr = text.substring(0, 1);
        String restLtrs = text.substring(1, text.length());
      
        firstLtr = firstLtr.toUpperCase();
        return firstLtr + restLtrs;
    }
}
