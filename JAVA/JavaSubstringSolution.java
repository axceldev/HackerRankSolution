public class JavaSubstringSolution {
    public static void main(String[] args) {
        String S = "Helloworld";
        int start = 3;
        int end = 7;
        System.out.println(start >= 0 && start < end ? S.substring(start, end) : "");
    }
}
