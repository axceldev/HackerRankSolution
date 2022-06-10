import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {

    public static void main(String[] args) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+"; // Tarea documentarse mas sobre expresiones regulares
        /**
         * He utilizado esta expresión regular: "\b(\w+)(?:\W+\1\b)+"
         * 
         * Al utilizar esta expresión regular en Java, tenemos que "escapar" los
         * caracteres de barra invertida con barras invertidas adicionales (como se hace
         * en el código anterior).
         * 
         * \w ----> Un carácter de palabra: [a-zA-Z_0-9]
         * \W ----> Un carácter no verbal: [^\w]
         * \b ----> Un límite de palabra
         * \1 ----> Coincide con lo que haya coincidido en el primer grupo de
         * paréntesis, que en este caso es el (\w+)
         * + ----> Coincide con lo que se coloca después de 1 o más veces
         * El ?: se añade para que sea un "grupo no capturador" (lo que significa que no se puede hacer group() para obtener el grupo), para un rendimiento ligeramente más rápido.
         * 
         * Los límites \b son necesarios para casos especiales como "Bob y Andy" (no
         * queremos que coincida "y" dos veces). Otro caso especial es "Mi tesis es
         * genial" (no queremos que coincida con "es" dos veces).
         */
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); 
        /**
         * Apreder de Pattern flag
         * Pattern.CASE_INSENSITIVE Activa la coincidencia
         * entre mayúsculas y minúsculas.
         */
        Scanner in = new Scanner(System.in);
        int numSentences = 1 /* Integer.parseInt(in.nextLine()) */;

        while (numSentences-- > 0) {
            String input = "Goodbye bye bye world world world" /* in.nextLine() */;
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0), m.group(1));
                /**
                 * m.group() es la coincidencia completa
                 * m.group(i) es la i-ésima coincidencia. Así pues, m.group(1) es la primera
                 * coincidencia (que está encerrada en el primer paréntesis)
                 */
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
