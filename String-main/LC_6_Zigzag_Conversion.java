import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int numRows = sc.nextInt();
        if (numRows == 1 || s.length() <= numRows) {
            System.out.println(s);
            return;
        }
        String[] c = new String[numRows];
        for (int i = 0; i < c.length; i++) {
            c[i] = "";
        }
        int cr = 0;
        boolean g = true;
        for (char ch : s.toCharArray()) {
            c[cr] += ch;
            if (cr == 0) {
                g = true;
            }
            if (cr == numRows - 1) {
                g = false;
            }
            cr += g ? 1 : -1;
        }
        String f = "";
        for (String a : c) {
            f += a;
        }
        System.out.println(f);
    }
}
