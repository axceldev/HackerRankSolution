import java.util.*;
import java.io.*;
import java.lang.*;

public class JavaLoopsIIHackerRank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = 2;
        for (int i = 0; i < t; i++) {
            int a = 5;
            int b = 3;
            int n = 5;
            int sum = a;
            for (int j = 0; j < n; j++) {
                int nextEle = (int) Math.pow(2, j) * b;
                sum = sum + nextEle;
                System.out.printf("%s ", sum);
            }
            if(i < t - 1) {
                System.out.print("\n");
            }
        }
        in.close();
    }
}
