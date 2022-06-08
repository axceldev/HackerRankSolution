import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class PatternSyntaxCheckersSolucion {
    public static void main(String[] args) {
        int testCases = 3;
		while(testCases>0){
			String pattern = "batcatpat(nat";
              try {
                Pattern.compile(pattern);
                System.out.println("Valid");
              } catch (PatternSyntaxException e) { //cuando salga exception en la consola la mejor opcion para gestiona es try catch.
                  System.out.println("Invalid");
              }
            testCases--;
		}   
    }
}
