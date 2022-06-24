

public class ValidUsernameRegularExpressionSolution {
    //private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 1;//Integer.parseInt(scan.nextLine());
        while (n-- != 0) {

            String userName = "Samantha";

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[A-a-zZ][a-zA-Z0-9_]{7,29}$";

    //Link --> https://www.youtube.com/watch?v=M72lwALYRJU entender las expresiones regulares
    // https://www.youtube.com/watch?v=wfogZfIS03U --> guia facil para aprender regex

    /*
    https://regex101.com/ --> page para validar regex
    https://regexr.com/ --> validar regex            
    */ 

}