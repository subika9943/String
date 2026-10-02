import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jewels = sc.nextLine();
        String stones = sc.nextLine();
        int c = 0;
        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            if (jewels.indexOf(ch) != -1) {
                c++;
            }
        }
        System.out.println(c);
    }
}
