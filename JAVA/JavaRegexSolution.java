
public class JavaRegexSolution {
    public static void main(String[] args) {
            String IP = "000.12.12.034";
            //System.out.println(IP.matches(new MyRegex().pattern));
            String expression = "(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])";
            /**
             * DESCRIPCION DE LA EXPRESION REGULAR
             * \\d Dígito. Equivale a [0-9]
             * {1,2} Indica que lo que va justo antes de las llaves se repite mínimo X veces y máximo Y veces. También podemos poner {X,} indicando que se repite un mínimo de X veces sin límite máximo.
             * A|B El carácter | es un OR.  A ó B
             * 01 Concatenación. 0 seguida de 1
             * 
             */
            String pattern = expression + "." + expression + "." + expression + "." + expression;
            System.out.println(IP.matches(pattern));
    }
}

class MyRegex {
    String expression = "(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = expression + "." + expression + "." + expression + "." + expression;
}

