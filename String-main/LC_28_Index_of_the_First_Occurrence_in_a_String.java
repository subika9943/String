import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        int result = haystack.indexOf(needle);
        System.out.println(result);
    }
}
