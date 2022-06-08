
public class JavaStringTokensSolution {

    public static void main(String[] args) {
        String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll 1232";

        //Limpiamos la cadena segun sus expresiones regulares
        s = s.replaceAll("[^a-z A-Z 1-9]", " ");
        /*
         * El símbolo ^ indica el principio del String. En este caso el String debe contener la expresión al principio.
         * [a-z1-9] Rango. Indica las letras minúsculas desde la a hasta la z (ambas incluidas) y los dígitos desde el 1 hasta el 9 (ambos incluidos)
         */
        s = s.replaceAll("\\s+", " "); // \\s = un espacio en blanco.  \\s+ = uno o mas espacios en blanco.
        
        s = s.trim();

        String[] tokens = s.split(" ");

        if (s.length() > 0) {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        } else
            System.out.println(0);

        /*
         * codigo prueba
         * String delims = "[ .,?!']+";
         * String[] tokens = s.split(delims);
         * System.out.println(tokens.length);
         * for (String token : tokens) {
         * System.out.println(token);
         * }
         */
    }
}
