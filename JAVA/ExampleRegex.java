
//https://learntutorials.net/es/java/topic/135/expresiones-regulares#:~:text=Una%20expresi%C3%B3n%20regular%20es%20una,util.
//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
import java.util.regex.*;

public class ExampleRegex {
    /**
     * Ejemplo del uso de expresiones regulares.
     * 
     */

    public static void main(String[] args) {
        //OPCION 1
        Pattern p = Pattern.compile("a*b");
        Matcher  m = p.matcher("aaaaab");
        boolean a = m.matches();
        System.out.println("Valido?: " + (a ? "Si" : "No"));
        
        //OPCION 2
        String expressionRegular = "a*c*d+"; //a* -->
        String textToSearch = "aaaaacdd";
        boolean b = Pattern.matches(expressionRegular, textToSearch);
        System.out.println("Valido?: " + (b ? "Si" : "No"));
    }
}
