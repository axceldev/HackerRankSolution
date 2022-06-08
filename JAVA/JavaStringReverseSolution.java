
public class JavaStringReverseSolution {

    public static void main(String[] args) {
        String A="madam";
        esPalindromo(A);
    }
    
    public static boolean esPalindromo(String cadena) {
		// Convertir a minúscula y quitar espacios " ", puntos "." y comas ","
		// También remplazar palabras con acento p.ej. í => i
		cadena = cadena.toLowerCase()
        .replace("á", "a")
        .replace("é", "e")
        .replace("í", "i")
        .replace("ó", "o")
        .replace("ú", "u")
        .replace(" ", "")
        .replace(".", "")
        .replace(",", "");
		// Invertir la cadena, y si es igual que la original entonces
		// son palíndromos
		String invertida = new StringBuilder(cadena).reverse().toString();

		return invertida.equals(cadena);
	}
}
