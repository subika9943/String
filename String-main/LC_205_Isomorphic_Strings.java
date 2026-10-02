import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = t.charAt(i);
            if (s.indexOf(c) != t.indexOf(d)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
