import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class JavaCurrencyFormatterSolution {
    public static void main(String[] args) {
        double payment = 12324.134;//scanner.nextDouble();
        //scanner.close();
        if(payment >= 0.0 && payment <= 1000000000.0) {
           Locale IND = new Locale("en", "IN");
           NumberFormat formattedPaymentUs = NumberFormat.getCurrencyInstance(Locale.US);
           NumberFormat formattedPaymentIndia = NumberFormat.getCurrencyInstance(IND);
           NumberFormat formattedPaymentChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
           NumberFormat formattedPaymentFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

           String us = formattedPaymentUs.format(payment);    
           String india = formattedPaymentIndia.format(payment);    
           String china = formattedPaymentChina.format(payment);    
           String france = formattedPaymentFrance.format(payment);  

           System.out.println("US: " + us);
           System.out.println("India: " + india);
           System.out.println("China: " + china);
           System.out.println("France: " + france);      
        }        
    }
}
